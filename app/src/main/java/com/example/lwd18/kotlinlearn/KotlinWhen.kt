package com.example.lwd18.kotlinlearn


/**
 * 创建者     李文东
 * 创建时间   2017/8/19 16:42
 * 描述	      kotlin的when表达式(和java中的switch有异曲同工之处,但比switch更加强大,更加方便)
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
fun main(args: Array<String>) {
  gradeStudent(9)

  diaryGenerator("颐和园")
}
//学生考试成绩
fun gradeStudent(score:Int) {
  when (score) {
    10 -> println("考了满分")
    9 -> println("干的漂亮")
    8 -> println("还可以")
    7 -> println("还需努力")
    6 -> println("刚及格")
    5 -> println("你完了")
  }
}
  //日记
  fun diaryGenerator(placeName:String){
    var diary="""今天天气不错,我们去${placeName}游玩,首先映入眼帘的是,${placeName} ${numTochinese(placeName.length)}个鎏金大字"""
    println(diary)
  }

//数字长度
fun numTochinese(num:Int):String{
  var result=when(num){
    1->"一"
    2->"二"
    3->"三"
    4->"四"
    5->"五"
    6->"六"
    else->num.toString()
  }
  return result
}