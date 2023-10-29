package com.divyank.kotlinprogramming
fun main(){
    val day = Day.SUNDAY

    day.printday()
    for(i in Day.values()){
        println(i)
    }
}
//itne set me se koi ek type ka object bana lo
//enum  restricts the type of an object can be made
enum class Day(val number:Int){
    SUNDAY(1), //object /instance of Day class
    MONDAY(2),
    TUESDAY(3);
    fun printday(){
        println("day is $this")
    }
}