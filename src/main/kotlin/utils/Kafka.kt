package utils

import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.KafkaStreams
import org.apache.kafka.streams.StreamsBuilder
import org.apache.kafka.streams.Topology
import org.apache.kafka.streams.kstream.Consumed
import org.apache.kafka.streams.kstream.Produced
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*
import java.util.concurrent.CountDownLatch





class Kafka {

    private val logger: Logger = LoggerFactory.getLogger(Kafka::class.java)

    fun runKafkaStreams(streams: KafkaStreams) {
        val latch = CountDownLatch(1)
        streams.setStateListener { newState: KafkaStreams.State, oldState: KafkaStreams.State ->
            if (oldState == KafkaStreams.State.RUNNING && newState != KafkaStreams.State.RUNNING) {
                latch.countDown()
            }
        }
        streams.start()
        try {
            latch.await()
        } catch (e: InterruptedException) {
            throw RuntimeException(e)
        }
        logger.info("Streams Closed")
    }
    fun buildTopology(inputTopic: String?, outputTopic: String?): Topology? {
        val stringSerde = Serdes.String()
        val builder = StreamsBuilder()
        builder
            .stream(inputTopic, Consumed.with(stringSerde, stringSerde))
            .peek { k: String?, v: String? ->
                println("Observed event: {$k}"+
                    v)
            }
            .mapValues { s: String ->
                s.uppercase(Locale.getDefault())
            }
            .peek { k: String?, v: String? ->
                println("Transformed event: {$k}"+
                    v)
            }
            .to(outputTopic, Produced.with(stringSerde, stringSerde))
        return builder.build()
    }

}