package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/9/2 16:24
 * 描述	      kotlin之尾递归优化(尾递归优化时返回的需要时函数本身)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  var result=0
  println(adds(10000,result))
}

 tailrec fun adds(num:Int,result:Int):Int{
   println("计算机运行了第${num}次,result=${result}")
  if (num==0){
    return 1
  }else{
    return adds(num-1,result+num)
  }
}