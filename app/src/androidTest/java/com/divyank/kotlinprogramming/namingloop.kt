package com.divyank.kotlinprogramming

fun main(args: Array<String>) {

    for (i in 0..4) {
        println(i)

        if (i == 2) {
            break
        }
    }

    println()

    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i  $j")
            if (i == 2 && j == 2)
                break@myLoop           //bahar vale loop se bahar ane keliye
        }
    }
}