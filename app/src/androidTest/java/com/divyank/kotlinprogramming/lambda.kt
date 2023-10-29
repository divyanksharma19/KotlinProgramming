package com.divyank.kotlinprogramming
//lamda - function with no name
fun main(){

    //var fn2 :(a:Double,b:Double)->Double = ::add1   //function type declared
    var lamda1 = {a:Int,b:Int ->a+b}
    val multilineLambda = {
        println("Hello")
        val a = 23
        "Hello everyone"
        2          //last value is return type of multiline lambda
    }
    val singleParaLambda ={x:Int->x*x}
    val lamda2:(Int)->Int = {x->x*x}
    val lamda3:(Int)->Unit = {x-> println("Hello") }
    val lambda3:(Int)->Int  = {it+it}
    println(multilineLambda())       //jo return karega(last value) vo print hogi
    println(calculator(2,3 ,{ x, y -> x + y} ))
    //or when lambda parameter is last parameter
    println(calculator(2,3) { x, y -> x + y })
    println(lambda3(2))
}
fun add1(a:Int,b:Int):Int{

    return a+b
}
fun calculator(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return add1(a,b)

}

