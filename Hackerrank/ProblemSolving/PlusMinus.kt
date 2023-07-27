package ProblemSolving
//https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
fun plusMinus(arr: Array<Int>) {
    var countP=0
    var countN=0
    var countZ=0

    for(i in arr){
        if(i >0){
            countP++
        }else if(i==0){
            countZ++
        }else{
            countN++
        }
    }
    val ratioP=countP.toDouble()/arr.size
    val ratioZ=countZ.toDouble()/arr.size
    val ratioN=countN.toDouble()/arr.size
    println(ratioP)
    println(ratioN)
    println(ratioZ)
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}