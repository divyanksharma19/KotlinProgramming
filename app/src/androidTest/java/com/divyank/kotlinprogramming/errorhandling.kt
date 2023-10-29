package com.divyank.kotlinprogramming

import java.lang.IllegalArgumentException

fun main(){
    val arr = arrayOf(1,2,3)
    try{
        println(arr[5])
   }
    catch(ex: NullPointerException){
        println("NUll pointer")
    }
    catch(exp : ArrayIndexOutOfBoundsException){
        println("Array index out of bound")
    }
    catch(e:Exception){   // Exception class is parent class of all exceptions call at last if specific error not found then executed
       println("Please check the array index")
    }
    finally{
        println("i will execeute no matter what")
    }
    createuser(5)
    createuser(-2)



}
fun createuser(count:Int){
    if(count<0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User list created")
    }
}