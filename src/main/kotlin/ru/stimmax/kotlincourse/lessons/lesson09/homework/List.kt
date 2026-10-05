package ru.stimmax.kotlincourse.lessons.lesson09.homework

//Создайте пустой неизменяемый список целых чисел.
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
//Создайте список строк и получите из него второй элемент, используя его индекс.
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.

fun main() {
    val list1 = listOf<Int>()

    val list2 = listOf("Hello", "World", "Kotlin")

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    list3.add(6)
    list3.add(7)
    list3.add(8)

    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")

    val list6 = listOf(1, 2, 3, 4, 5)
    for (number in list6) {
        println(number)
    }

    val list7 = listOf("Hello", "World", "Kotlin")
    println(list7[1])

    val list8 = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 10

    val list9a = listOf("Hello", "Kotlin")
    val list9b = listOf("Java", "World")
    val resultList = mutableListOf<String>()
    for (element in list9a) {
        resultList.add(element)
    }
    for (element in list9b) {
        resultList.add(element)
    }
    println(resultList)

    val list10 = listOf(5, 2, 8, 1, 10)
    var min = list10[0]
    var max = list10[0]
    for (number in list10) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    println("Минимум: $min")
    println("Максимум: $max")

    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbers = mutableListOf<Int>()
    for (number in list11) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    println(evenNumbers)
}