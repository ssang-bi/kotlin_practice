fun readNumber (reader: String) {
    val number = try {
        Integer.parseInt(reader)
    }
    catch (e: NumberFormatException) { // 예외
        null
    }
    finally {
        println("readNumber fun end.")
    }
    println(number)
    // 처리하지 않은 예외 throws 명시 X
}
fun main() {
    readNumber("5")
    readNumber("t")
}