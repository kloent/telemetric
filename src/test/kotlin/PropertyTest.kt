
import modules.utils.PropertyLoader
import org.junit.jupiter.api.Test


class PropertyTest {
    val prop: PropertyLoader = PropertyLoader("src/main/resources/configs/rest.properties")

    init {
        setProp()
        addProp()
        getProp()
    }

    internal fun setProp(){
       prop.newPropertyFile("src/main/resources/configs/rest.properties")
    }

    internal fun addProp(){
        prop.addProperty("test","test")
    }
    @Test
    internal fun getProp(){
        val base:String = prop.getProperty("test")
        println(base)
    }

}