package controller

import com.github.lgooddatepicker.components.DatePicker

class Log {

    val firstDate = DatePicker()
    val secondDate = DatePicker()

    fun getDate(){
        println("${firstDate.date} - ${secondDate.date}")
    }


}