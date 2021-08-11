// 함수
fun max(n1: Int, n2: Int): Int {
    return if (n1 > n2) n1 else n2  // if식, if 문하고 차이 점 : if 식은 값을 만들어 낼 수 있다.
}

fun maxShort(n1: Int, n2: Int): Int = if (n1 > n2) n1 else n2 // 식이 본문인 함수

fun maxShortMore(n1: Int, n2: Int) = if (n1 > n2) n1 else n2  // 타입 추론

fun main() {
    println(max(7, 5))
    println(maxShort(7,5))
    println(maxShortMore(7,5))
}
