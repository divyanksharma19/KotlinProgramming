package com.divyank.kotlinprogramming

fun main(){
    println("Hello World")
    println("Hello world".formattedString())

}
//extension function cannot acces private members of class
fun String.formattedString():String{
    return "------------ $this ---------------"
}