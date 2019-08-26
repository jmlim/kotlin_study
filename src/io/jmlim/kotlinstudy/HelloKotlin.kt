import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin!")

    val person = User("kildong", 20)
    var person2 = Person(123, "Kildong", "Programmer")
    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)