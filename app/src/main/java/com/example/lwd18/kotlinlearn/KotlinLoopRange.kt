package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/19 17:16
 * 描述	      kotlin基础(区间/for循环/步长/反转/总数)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  /**
   * 区间
   * for循环 利用 in 将区间中的值取出来
   */
  var nums=1..100 //声明了一个数组,数组中的值为1,2,3...100
  var result=0
  for (num in nums){
    result+=num
  }
  println("结果:${result}")
}

//开区间和闭区间
fun qujian(){
  var num=1..100 //闭区间 [1,100]
  var num2=1 until 100 //开区间[1,100)


  //步长
  var nums1=1..16
  for (a in nums1 step 2){  //step 步长
    println(a) //1,3,5,7,9,11,13,15
  }

  //API

  //反转
  var reversed = nums1.reversed()
  for (a in reversed){
    println(a)//15,13,11,9,7,5,3,1
  }

  //总数
  println("总数为:"+reversed.count())
}