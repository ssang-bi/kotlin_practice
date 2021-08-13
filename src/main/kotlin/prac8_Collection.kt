fun main() {
    // 집합이나 리스트 생성가능
    val set = hashSetOf(1, 7, 53)
    println(set.javaClass)

    val list = arrayListOf(1, 7, 53)
    println(list.javaClass)

    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    // 1.to("one") == 1 to "one"  (일반적인 방식의 메소드 호출 == 중위 호출 방식으로 메소드 호출)
    println(map.javaClass)
    // 각 객체가 속한 클래스 확인 결과 기존 자바 컬렉션을 나타냄
    // 자바에서의 컬렉션 객체와 동일한 객체
    test("1", "2", "3")
}
fun test(vararg values: String) {   // 가변 길이 인자
    for (s in values) println(s)
}