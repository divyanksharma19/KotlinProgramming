package com.divyank.kotlinprogramming

fun main(){
    val students = mutableMapOf<Int,String>()
    students.put(1,"Divyank")
    students.put(2,"Harshit")
    students.put(3,"Didrikhya")
      println(students.get(2))
    for((key,value) in students){
        println("$key = $value")
    }
    students[8] ="Himanshu"

    val student2 = mapOf<Int,String>(1 to "Arjun",2 to "Saurav")
    println(student2)
}