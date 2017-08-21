package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/21 9:13
 * 描述	      kotlin基础(人机交互之键盘输入)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  println("请输入第一个数字")
  var number = readLine()
  println("请输入第二个数字")
  var number2 = readLine()

  //!!表示确保输入的数字一定不为空,(空和空是不能相加的)
  var num1:Int = number!!.toInt()
  var num2:Int=number2!!.toInt()

  println("${num1}+${num2}=${num1+num2}")
}