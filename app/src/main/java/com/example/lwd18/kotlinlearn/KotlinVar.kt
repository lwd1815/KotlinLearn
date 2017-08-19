package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/19 15:08
 * 描述	      kotlin基础
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>):Unit{
  //byte  -128--127
  /**
   * var 代表变量 可以被修改
   * 变量的声明以及
   * 智能类型推断
   *
   */
  var i = 10;
  i = 19;
  //i=99999999999;(超出int的取值范围,报错)
  var j = 999999999999999;
  var s = "haha"
  //显式(指定数据类型)
  var i2 : Int =19;
  var i3:Byte =127;
  //i3=257;(超出byte的取值范围,报错)

  /**
   * val 常量,只读,不可以被修改
   */

  val a="no"
 // a="s" 变量不能被修改

  /**
   * 变量的取值范围
   * kotlin中更常见的容器
   * Byte 存储值范围  整数 -128--127
   * Short 存储值范围  整数 -32768--32767
   * Int 存储值范围  整数 -2147483648--2147483647
   * Long 存储值范围  整数 -9223372036854775807--9223372036854775807
   * Float 存储值范围  小数,小数点可以精确到6位
   * Double 存储值范围  小数 小数点可以精确到15--16位
   * String 存储值范围  字符串,用""双引号引起来的字符串都可以存
   *
   */
  //Byte
  val aByte: Byte=Byte.MAX_VALUE
  val bByte: Byte=Byte.MIN_VALUE

  println("byte的最大值:"+aByte)
  println("byte的最小值:"+bByte)

  //Long
  val along: Long=Long.MAX_VALUE
  val blong: Long=Long.MIN_VALUE

  println("Long的最大值:"+along)
  println("Long的最小值:"+blong)


  //二进制
  val aInt: Int=0b0011
  println("aInt的值"+aInt)

  //函数入门(偶函数,奇函数.三角函数,幂函数)
  //计算机的函数就是程序执行的小片段,这些小片段有机的组合在一起就会执行一个业务

  //利用函数打印菱形
  printlStart()

  //布尔运算
  booleanTest()

  //交互式编程
  //kotlin和java都是基于JVM的
  //配置环境变量jdk kotlinc

  //kotlin函数的编写规则
  /**fun 函数名(参数名:参数类型):返回值类型{函数体}
   *
   * 如果返回值类型为Unit 则可以省略
   *
   */
}

fun printlStart(){
  println("*")
}

fun booleanTest(){
  var num1=4
  var num2=6
  println(num1>num2)//------false
  println(num1<num2)//______true

  //根号5/4/3
  var num3 = Math.sqrt(5.0)-Math.sqrt(4.0)
  var num4 = Math.sqrt(4.0)-Math.sqrt(43.0)
  println(num3>num4)

  //次方(2的100次方)
  var num5 = Math.pow(2.0, 100.0)
  var num6 = Math.pow(3.0, 75.0)
  println(num5>num6)
}