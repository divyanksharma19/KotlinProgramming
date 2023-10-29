package com.divyank.kotlinprogramming


//Note-
//too many lamda function in app has performance issues because new class is made for
//every lambda ---- so inline function are used
fun main(){
    calculateruntime {
        loop(1000000)
    }
}

//inline function -- jaha bhi ye function call hoga compiler function ki body chipka dega  --to instance banane ki jaruart nhi hogi
inline fun calculateruntime(fn:()->Unit):Unit{
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end-start}")
}
fun loop(n:Long){
    for(i in 1..n){

    }
}