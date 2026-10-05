package ru.stimmax.kotlincourse.lessons.lesson09.homework

//    1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
//    2. Создайте пустой массив строк размером 10 элементов.
//    3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
//    4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
//    5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
//    6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
//    7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
//    8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
//    9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
//    10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.

fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5)

    val array2 = Array(10) { "" }

    val array3 = Array(5) { index -> index * 2.0 }

    val array4 = Array(5) { 0 }
    for (i in array4.indices) {
        array4[i] = i * 3
    }

    val array5 = arrayOf(null, "String1", "String2")

    val array6 = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = Array(array6.size) { 0 }
    for (i in array6.indices) {
        copiedArray[i] = array6[i]
    }

    val array7a = arrayOf(10, 20, 30, 40, 50)
    val array7b = arrayOf(5, 6, 7, 8, 9)
    val resultArray = Array(5) { 0 }
    for (i in array7a.indices) {
        resultArray[i] = array7a[i] - array7b[i]
        println(resultArray[i])
    }

    val array8 = arrayOf(1, 3, 7, 5, 9)
    var i = 0
    var index = -1
    while (i < array8.size) {
        if (array8[i] == 5) {
            index = i
            break
        }
        i++
    }
    println(index)

    val array9 = arrayOf(1, 2, 3, 4, 5, 6)
    for (number in array9) {
        if (number % 2 == 0) {
            println("$number - чётное")
        } else {
            println("$number - нечётное")
        }
    }

    findString(
        arrayOf("Hello Kotlin", "Hello Java", "Hello Python"),
        "Kotlin"
    )
}

fun findString(array: Array<String>, search: String) {
    for (element in array) {
        if (element.contains(search)) {
            println(element)
        }
    }
}