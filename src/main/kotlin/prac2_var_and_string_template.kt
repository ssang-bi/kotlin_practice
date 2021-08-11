fun main() {
    // 변수
    var number1: Int = 1
    var number2: Int = 2
    var answer1 = "Answer1"
    var answer2: String
    answer2 = "Answer2"
//  var answer3   // error

    var mutable_number = 3
    val immutable_number = 3
    mutable_number = 5      // var 변수는 변경가능한 변수
//  immutable_number = 5    // val 변수는 변경 불가능한 변수

    // 문자열 템플릿
    val helloStr = "Hello"
    println("$helloStr Kotlin!")    // $기호를 통해 문자열 안에 변수 사용 가능
    println("${helloStr} Kotlin!")  // {}를 이욯하여 변수 감싸는 것 추천

    val calcNum= 3 + 5
    println("calcNum: ${calcNum}")
    println("calcNum: ${3 + 5 + 5}")  // 식 자체도 넣을 수 있음

    println("Max number in 5 or 3, is ${if (5 > 3) 5 else 3}") // if 식도 가능
}