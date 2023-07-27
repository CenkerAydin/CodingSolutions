package ProblemSolving

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map { roundSingleGrade(it) }.toTypedArray()


}
fun roundSingleGrade(grade: Int): Int {
    val nextMultipleOfFive = (grade / 5) * 5 + 5
    return if (nextMultipleOfFive - grade < 3 && grade >= 38){ nextMultipleOfFive
    }else{
        grade
    }
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}