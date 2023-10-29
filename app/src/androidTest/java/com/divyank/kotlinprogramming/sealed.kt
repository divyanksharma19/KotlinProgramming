package com.divyank.kotlinprogramming
fun main(){
  //  val tile = Red("mushrrom",25)
    //val tile2 = Red("Fire",30)
    val tile:Tile = Red("Mushroom",25)
    //state change handel in sealed class
    val points = when(tile){
        is Red-> tile.points*2
        is Blue-> tile.points*5
    }
}
sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()