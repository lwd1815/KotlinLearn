package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/9/2 16:10
 * 描述	      kotlin基础之递归
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  println("${fact(10)}")
  println("${add(100)}")
  //超大数字bigInteger
}

//阶乘
fun fact(num:Int):Int{
  if (num==1){
    return 1
  }else {
    return num * fact(num - 1)
  }
}

fun add(num:Int):Int{
  if (num==1){
    return 1
  }else{
    return num+ add(num-1)
  }
}