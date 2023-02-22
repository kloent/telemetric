package modules.utils

import java.io.File
import java.io.FileInputStream
import java.util.*

/**
 * Class for work with properties files
 *
 * @constructor need path to file for initial object
 */

class PropertyLoader() {

    private var prop: Properties = Properties()

    /**
     * @param path to file
     */
    fun setPropertyFile(path: String){
        prop.load(FileInputStream(File(path)))
    }

    /**
     *
    *@param k name. can rewrite property
    *@param v value of property
    */
    fun addProperty(k:String,v: String){
        prop.setProperty(k,v)
    }

    /**
     * @param name key of property name
     * @return [String] value of param
     */
    fun getProperty(name: String): String{
        return prop.getProperty(name)
    }
}