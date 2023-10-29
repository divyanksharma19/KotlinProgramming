package com.divyank.kotlinprogramming

fun main(args: Array<String>) {

    MyClass.count           // You can print it and check result

    MyClass.typeOfCustomers()
}

class MyClass {
//  class can have only one companion object
    //companion is like friend from whom we can use its resources without asking
    companion object {

        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Indian"
        }
    }

}