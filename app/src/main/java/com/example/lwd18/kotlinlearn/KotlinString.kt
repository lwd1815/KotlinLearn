package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/19 15:54
 * 描述	      kotlin基础(字符串的比较/字符串中的占位符/条件控制语句)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  var a = 8
  var b = 2

  println("a+b==" + plus(a, b))
  println("a-b==" + sub(a, b))
  println("a*b==" + mutl(a, b))
  println("a/b==" + devide(a, b))


  var diaryGenerater = diaryGenerater("我好伤心")
  println(diaryGenerater)

  checkFace(50)

  println("${10}和${12}中较大的那个值为${returnBig(4, 6)}")

  //字符串比较

  var strq1 = "张三"
  var str2 = "张三"

  var an="Android"
  var and = "android"


  println(strq1==str2)// true== 相当于java中的equal
  /**
   * 下面的第二个参数(true/false)
   *
   * 如果是false 表示不忽略大小写
   * 如果是true 表示忽略大小写
   */
  println(an.equals(and,false)) //打印出来为false
  println(an.equals(and,true))  //打印出来为true

}

fun plus(a: Int, b: Int): Int {
  return a + b
}

fun sub(a: Int, b: Int): Int {
  return a - b
}

fun mutl(a: Int, b: Int): Int {
  return a * b
}

fun devide(a: Int, b: Int): Int {
  return a / b
}

fun sayHello(a: String, b: Int): String {
  return a + b;
}

fun chechAge(a: Int, b: Int): Boolean {
  //(a + b)> 18?true:false
  if (a + b == 18) {
    return true
  }
  return false
}

//日记生成器(接收参数是地点,返回内容)
/**
 * ${} string中的占位符
 */
fun diaryGenerater(placeName: String): String {
  var temple = """今天天气晴朗,万里无云,我的小金鱼淹死了,${placeName}  ${placeName.length}个字"""
  return temple
}

//条件控制语句
fun checkFace(score: Int) {
  if (score > 80) {
    println("这是一个帅哥")
  } else {
    println("这是一个衰哥")
  }
}

//返回两个数中最大的那个
fun returnBig(a: Int, b: Int): Int {
  if (a > b) {
    return a
  } else {
    return b
  }
}


