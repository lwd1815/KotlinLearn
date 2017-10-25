package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/21 8:50
 * 描述	      kotlin基础(具名参数/默认参数)
 * 更新者     $Author$
 * 更新时间   $Date$
 */
fun main(args: Array<String>) {

  /**
   * 正常计算
   */
  var area= getRectArea(2.0f,3.0f)
  println(area)

  var long= getCircleLong(2.0f,3.0f)
  println(long)

  var tj= getCircle(2.0f,3.0f,4.0f)
  println(tj)

  var bmj= getCircle(2.0f,3.0f)
  println(bmj)

  /**
   * 具名参数计算
   */

  var long1= getCircleLong1(ridum = 2.0f)
  println(long1)

  var tj1= getCircle1(ridum = 2.0f,high =3.0f)
  println(tj1)

  var bmj1= getCircle1(ridum = 2.0f)
  println(bmj1)
}

/**
 * 正常函数
 */
//获取长方形面积
fun getRectArea(long:Float,kuan:Float):Float{
  return long*kuan
}

//获取圆的周长
fun getCircleLong(PI:Float,ridum:Float):Float{
  return 2*PI*ridum
}

//获取圆柱体的体积
fun getCircle (PI:Float,ridum:Float,high:Float):Float{
  return PI*ridum*ridum*high
}

//获取球的表面积
fun getCircle(PI:Float,ridum:Float):Float{
  return PI*ridum*ridum*4
}


val pi=3.1415926f
/**
 * 具名参数函数
 *
 */

//获取长方形面积
fun getRectArea1(long:Float,kuan:Float):Float{
  return long*kuan
}

//获取圆的周长
fun getCircleLong1(PI:Float=pi,ridum:Float):Float{
  return 2*PI*ridum
}

//获取圆柱体的体积
fun getCircle1(PI:Float= pi,ridum:Float,high:Float):Float{
  return PI*ridum*ridum*high
}

//获取球的表面积
fun getCircle1(PI:Float= pi,ridum:Float):Float{
  return PI*ridum*ridum*4
}