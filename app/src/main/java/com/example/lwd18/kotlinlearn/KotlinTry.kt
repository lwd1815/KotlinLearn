package com.example.lwd18.kotlinlearn


/**
 * ������     ���Ķ�
 * ����ʱ��   2017/9/2 15:53
 * ����	      kotlin 异常处理
 * ������     $Author$
 * ����ʱ��   $Date$
 * ��������   ${TODO}
 */
fun main(args: Array<String>) {
  while (true) {
    println("欢迎使用我的计算器")
    println("请输入第一个数字")
    var number1 = readLine()
    println("请输入第二个数字")
    var number2 = readLine()


    //如果这样直接输出,会被当成是string类型的
    println("${number1}+${number2}=${number1 + number2}")

    try {
      //在类型后面跟?表示这个对象可能为空,跟!!表示这个类型一定不为空
      var num1: Int = number1!!.toInt()
      var num2: Int = number2!!.toInt()
      println("${num1}+${num2}=${num1 + num2}")
    } catch (e: Exception) {
      println("大哥请输入数字额")
    }
  }
}