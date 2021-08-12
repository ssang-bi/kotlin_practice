// 타입 검사와 타입 캐스트를 조합하여 진행ㄹ -> 타입 검사 이후 별도의 타입 캐스팅 불필요

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {     // 스마트 캐스팅 : is 이용하여 타입 검사와 타입 캐스팅 동시 처리
        return e.value
        /*
        val n = e as Num    // 비교를 위한 타입 캐스트 코드
        return n.value      // e를 Num 객체로 캐스트하며 n으로 받는 코드
         */
    }
    if (e is Sum) {    // 스마트 캐스팅  : is 이용하여 타입 검사와 타입 캐스팅 동시 처리
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalUseWhen(e: Expr): Int =    // 위의 함수를 "when"을 이용하여 변형한 함수
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalUseWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
}