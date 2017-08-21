package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/21 9:08
 * 描述	      kotlin基础(字符串与数字之间的转换)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  var a="13"
  var b=13

  //数字转字符串
  a=b.toString()

  //字符串转数字
  b=a.toInt()


  var c="a3"

  b=c.toInt()//编译不报错,但是运行会报NmuberFormatException
}