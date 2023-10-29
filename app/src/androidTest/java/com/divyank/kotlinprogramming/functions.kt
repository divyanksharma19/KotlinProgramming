package com.divyank.kotlinprogramming

fun main(){
    var fn = ::add
    //or
    var fn2 :(a:Double,b:Double)->Double = ::add   //function type declared
    println(fn2(2.0,3.0))
    calculator(2.0,3.0,::add)
}
fun add(a:Double,b:Double):Double{
    return a+b
}
//higher order function - which accept function as parameter or return a function or both
fun calculator(a :Double,b:Double,gn:(Double,Double)->Double){
                println(gn(a,b))
}