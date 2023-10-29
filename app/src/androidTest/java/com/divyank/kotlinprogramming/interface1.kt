package com.divyank.kotlinprogramming


/*
*   Abstract Class
* */
fun main(args: Array<String>) {

//    var person = MyPerson()   // Not allowed. You cannot create instance of abstract class

    var person = Indian()       // Allowed. Abstract Super class reference variable
    // pointing to child class object.
    person.name = "Steve"
    person.eat()
    person.goToSchool()
}
//abstract class can have both abstract and non abstract properties and methods
//if a class has abstract method or prop then that class has to be abstract
// you cannot create instance of abstract class
abstract class MyPerson {

    abstract var name: String

    abstract fun eat()      // abstract properties are 'open' by default

    open fun getHeight() {} // A 'open' function ready to be overridden

    fun goToSchool() {}     // A normal function
}

class Indian: MyPerson() {

    override var name: String = "dummy_indian_name"

    override fun eat() {
        // Our own code
    }
}