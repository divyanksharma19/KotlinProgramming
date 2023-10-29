package com.divyank.kotlinprogramming
//cheezycode
fun main(){
    dragobject(arrayOf(circle(2.3),square(2.3),player("Rahul")))
}
fun dragobject(objects:Array<draggable>){
    for(obj in objects) {
        obj.drag()
    }
}
//interface to implement common behaviour among classes .   here shape and player
// to use polymorphism in unrelated set of classes(i.e classes that do not belong to same hierarchy)
interface draggable {
    fun drag()
}

abstract class shape:draggable{
    abstract fun area():Double
}
class circle(val radius:Double) :shape(){
    override fun area(): Double=Math.PI*radius*radius
    override fun drag() {
        println("Cicle")
    }
}
class square(val side:Double) :shape(){
    override fun area(): Double=side*side
    override fun drag() {
        println("square")
    }
}

class player(val name:String):draggable{
    override fun drag() {
        println("$name is dragging")
    }

}
