import java.lang.StringBuilder

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",   //  함수 선언 시점에 특정 인자의 디폴트 값 지정 가능
    prefix: String = "",        //  함수 오버로딩하는 경우 방지 가능
    postfix: String = ""        //
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}



fun main() {
    val list = listOf(1, 2, 3, 4)
    // 함수 호출 시 인자 혼동할 가능성 있으므로 함수 호춯시에 인자의 이름 활용
    println(joinToString(list, separator = ";", prefix = "(", postfix = ")"))
}
