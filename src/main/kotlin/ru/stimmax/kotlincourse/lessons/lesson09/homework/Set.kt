package ru.stimmax.kotlincourse.lessons.lesson09.homework


//    Создайте пустое неизменяемое множество целых чисел.
//    Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
//    Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
//    Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
//    Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
//    Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
//    Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
//    Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.

fun main() {
    val set1 = setOf<Int>()

    val set2 = setOf(1, 2, 3)

    val mutableSet3 = mutableSetOf("Kotlin", "Java", "Scala")
    mutableSet3.add("Swift")
    mutableSet3.add("Go")

    val mutableSet4 = mutableSetOf(1, 2, 3, 4, 5)
    mutableSet4.remove(2)

    val set5 = setOf(10, 20, 30, 40, 50)
    for (number in set5) {
        println(number)
    }

    val set6 = setOf("Apple", "Banana", "Cherry")
    println(checkStringInSet(set6, "Banana"))
    println(checkStringInSet(set6, "Grapes"))

    val set7 = setOf("Dog", "Cat", "Bird")
    val listFromSet = mutableListOf<String>()
    for (element in set7) {
        listFromSet.add(element)
    }
}

fun checkStringInSet(set: Set<String>, str: String): Boolean {
    for (element in set) {
        if (element == str) {
            return true
        }
    }
    return false
}