package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/19 16:33
 * 描述	      kotlin基础(kotlin对于空指针的处理)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  heat("水")//-------------打印 "热水"
  //heat(null)----------编译不通过(null can not as a value of string type)
  heat2(null) //在数据类型string后面加? 表示数据可以为空--------打印为热null
}

fun heat(str:String):String{
  return "热"+str
}

fun heat2(strs: String?):String{
  return "热"+strs
}
