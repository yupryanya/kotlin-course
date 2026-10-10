package ru.stimmax.kotlincourse.lessons.lesson11.homework

/*
Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
1. Не принимает аргументов и не возвращает значения.
2. Принимает два целых числа и возвращает их сумму.
3. Принимает строку и ничего не возвращает.
4. Принимает список целых чисел и возвращает среднее значение типа Double.
5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
6. Не принимает аргументов и возвращает nullable вещественное число.
7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
8. Принимает целое число и возвращает nullable строку.
9. Не принимает аргументов и возвращает список nullable строк.
10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
Напишите валидную сигнатуру метода а так же рабочий код для задач.
11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
*/

public fun task1() {
    print("Hello, World!")
}

public fun task2(a: Int, b: Int): Int {
    return a + b
}

public fun task3(str: String) {
    println(str)
}

public fun task4(numbers: List<Int>): Double {
    return numbers.average()
}

private fun task5(strOrNull: String?): Int? {
    return strOrNull?.length
}

public fun task6(): Double? {
    return null
}

private fun task7(numbersOrNull: List<Int>?) {
}

public fun task8(num: Int): String? {
    return if (num > 0) num.toString() else null
}

public fun task9(): List<String?> {
    return listOf(null, "Hello", "World")
}

public fun task10(strOrNull: String?, intOrNull: Int?): Boolean? {
    if (strOrNull == null || intOrNull == null) {
        return null
    }
    return true
}

public fun multiplyByTwo(num: Int): Int {
    return num * 2
}

public fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

public fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

public fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

public fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}