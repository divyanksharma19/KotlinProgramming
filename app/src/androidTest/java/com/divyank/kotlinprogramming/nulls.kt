package com.divyank.kotlinprogramming

import java.util.Locale

fun main(){
    var gender:String?=null
    if (gender != null) {
        println(gender.uppercase())
    }
    gender?.let{
        println("Line 1 $gender")
        println("$it")
    }
     var selectedvalue: String =gender?:"NA"  //agar null hua to NA value lelega selectedvalue
     var value = gender!!.uppercase() //agar null hua to exception  !! means call karo hi function

}