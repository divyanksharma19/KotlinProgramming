package com.divyank.kotlinprogramming

fun main(){
    val nums = listOf<Int>(1,2,3) // by default list are immutable
    val list1 = mutableListOf<Int>(1,2,3,4)
    println(list1[1])
    list1[1]=5
    println(list1[1])
    list1.add(6)
    list1.remove(3)
    println(list1)
    list1.addAll(nums)
    println(list1)
}