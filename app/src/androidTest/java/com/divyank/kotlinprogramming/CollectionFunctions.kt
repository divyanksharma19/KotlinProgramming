package com.divyank.kotlinprogramming

fun main(){
    val nums:List<Int> = listOf(1,2,3,4,5)
   // val list = nums.filter(::isOdd)
    //or
//    val list = nums.filter(fun(a:Int):Boolean{
//        return a%2!=0
//    })
    //or using lambda
    val list = nums.filter { it: Int -> it % 2 != 0 }

    println(list)
    val userlist = listOf(User1(1,"A"), User1(2,"B"),User1(3,"C"))

    userlist.forEach{println(it)}


   println(userlist.filter { it.id==2 })


    //map -use case -  to convert data from one form to another(map this data to another form
    val list2 = nums.map{it*it}
    println(list2)
    val paiduserlist = userlist.map{paidUser(it.id,it.name,"PAID")}

}
//fun isOdd(x:Int):Boolean{
//    return x%2!=0
//}

data class User1(val id:Int,val name:String)
data class paidUser(val id:Int,val name:String,val type:String)