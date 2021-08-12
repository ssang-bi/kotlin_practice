/*
// while : 일반적인 형식
while(조건){
...
}
do {
...
} while(조건)
 */
fun main() {
    for (i in 1 .. 10) println(i)  // in : 범위 값 처리, .. 연산자 : 범위 표시(폐구간 [])
    for (i in 1 .. 10 step 2) println(i) // 2씩 증가
    for (i in 10 downTo 1) println(i)  // 값 감소

    println(isLetter('k'))
    println(isLetter('0'))

    println(recognize('8'))
    println(recognize('t'))
}
fun isLetter(c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z' // c가 범위안에 속하는지 확인

fun recognize(c: Char) = when(c){  // when 이용
    in '0' .. '9' -> "digit"
    in 'a' .. 'z', in 'A' .. 'Z' -> "letter"
    else -> "?"
}
