package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/21 8:39
 * 描述	      kotlin基础(函数表达式)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {


  println(add(3,5))
  println(add1(3,5))



  //var i=3
  //kotlin中函数和参数同级
  /**
   * 函数表达式
   */
  var i={x:Int,y:Int ->x+y}
  var result=i(3,5)

  print(result)

  //函数的第二种声明
  var j:(Int,Int)->Int={x,y->x+y}
  var result2=j(3,5)
  println(result2)

}
//如果大括号中的业务逻辑只有一行,可以将大括号省略,然后直接返回函数(如add1)
fun add(x:Int,y:Int):Int{
  return x+y
}

//函数式(效果和add一样)
fun add1(x:Int,y:Int):Int=x+y
