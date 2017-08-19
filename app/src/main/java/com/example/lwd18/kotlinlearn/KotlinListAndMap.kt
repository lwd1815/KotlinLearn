package com.example.lwd18.kotlinlearn

import java.util.*


/**
 * 创建者     李文东
 * 创建时间   2017/8/19 17:30
 * 描述	      kotlin(list/map集合)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  //声明List集合
  var lists = listOf<String>("买鸡蛋", "买大米", "买杜蕾斯")

  //正长打印

  for (list in lists) {
    println(list)
  }

  //按位置打印list中的数据

  for ((i, e) in lists.withIndex()) {
    println("$i $e")
    //-----0 买鸡蛋
    //-----1 买大米
    //-----2 买杜蕾斯
    /**
     * so i 代表索引位置,e 代表索引对应的值
     */
  }


  //声明Map集合
  var map = TreeMap<String, String>()
  map["好"] = "good"
  map["学习"] = "study"
  map["天"] = "day"
  map["向上"] = "up"

  //获取里面的内容

  println(map["好"]) //----------good

}

