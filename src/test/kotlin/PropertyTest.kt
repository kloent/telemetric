
import modules.utils.PropertyLoader
import org.junit.jupiter.api.Test


class PropertyTest {
    val prop: PropertyLoader = PropertyLoader("src/main/resources/configs")

    init {
        addProp()
        getProp()
        saveProp()
        setProp()
    }

    internal fun setProp(){
       prop.setPropertyFile()
    }

    internal fun addProp(){
        prop.addProperty("test","test")
    }
    @Test
    internal fun getProp(){
        val base:String = prop.getProperty("test")
        println(base)
    }
    fun saveProp(){
        prop.saveProperty()
    }

}