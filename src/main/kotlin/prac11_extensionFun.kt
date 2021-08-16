// 확장 함수를 만들 때에는, 함수 이름앞에 확장할 클래스 이름 붙이면됨.
// 클래스 이름 : 수신 객체 타입, 확장 함수가 호출되는 대상이 되는 객체 : 수신 객체
fun String.lastChar() : Char = this.get(this.length - 1) // lastChar() 함수는 String 클래스 확장

open class View {
    open fun click() = println("View clicked!")
}

class Button : View() {
    override fun click() = println("Button clicked!")
}

fun View.showOff() = println("View showOff")
fun Button.showOff() = println("Button showOff")

val String.lastChar: Char               // 확장 프로퍼티, 일반적인 프로퍼티에서 수신 객체 클래스 추가
    get() = this.get(this.length - 1)   // get() 정의 필요

fun main() {
    println("Kotlin".lastChar())
    // n

    val view: View = Button()
    view.click()
    // Button clicked!
    view.showOff()   // 확장 함수는 override X
    // View showOff

    println("Kotlin".lastChar)
    // n
}