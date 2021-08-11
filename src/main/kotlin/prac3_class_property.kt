class Person(val name: String, var isMarried: Boolean)

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val person = Person("Door", false)
    println(person.name)
    println(person.isMarried)

    val rectangle1 = Rectangle(5, 4)
    println(rectangle1.isSquare)
    val rectangle2 = Rectangle(5, 5)
    println((rectangle2.isSquare))
}