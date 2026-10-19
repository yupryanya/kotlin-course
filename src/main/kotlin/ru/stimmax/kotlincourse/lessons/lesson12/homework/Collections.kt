package ru.stimmax.kotlincourse.lessons.lesson12.homework

fun collectionToResult() {
//    Задачи на приведение коллекции к значению
// 1. Проверить, что размер коллекции больше 5 элементов.
// 2. Проверить, что коллекция пустая
// 3. Проверить, что коллекция не пустая
// 4. Взять элемент по индексу или создать значение если индекса не существует
// 5. Собрать коллекцию в строку
// 6. Посчитать сумму всех значений
// 7. Посчитать среднее
// 8. Взять максимальное число
// 9. Взять минимальное число
// 10. Взять первое число или null
// 11. Проверить что коллекция содержит элемент

    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    val result1 = numbers.size > 5

    val result2 = numbers.isEmpty()

    val result3 = numbers.isNotEmpty()

    val result4 = numbers.get(5) ?: 0

    val result5 = numbers.joinToString { "," }

    val result6 = numbers.sum()

    val result7 = numbers.average()

    val result8 = numbers.maxOrNull()

    val result9 = numbers.minOrNull()

    val result10 = numbers.firstOrNull()

    val result11 = numbers.contains(8)
}

//Задачи на обработку коллекций
// 1. Отфильтровать коллекцию по диапазону 18-30
// 2. Выбрать числа, которые не делятся на 2 и 3 одновременно
// 3. Очистить текстовую коллекцию от null элементов
// 4. Преобразовать текстовую коллекцию в коллекцию длин слов
// 5. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
// 6. Отсортировать список в алфавитном порядке
// 7. Взять первые 3 элемента списка
// 8. Распечатать квадраты элементов списка
// 9. Группировать список по первой букве слов
// 10. Очистить список от дублей
// 11. Отсортировать список по убыванию
// 12. Взять последние 3 элемента списка

fun task1(numbers: List<Int>): List<Int> {
    return numbers.filter { it in 18..30 }
}

fun task2(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 && it % 3 != 0 }
}

fun task3(strings: List<String?>): List<String> {
    return strings.filterNotNull()
}

fun task4(strings: List<String>): List<Int> {
    return strings.map { it.length }
}

fun task5(strings: List<String>): Map<String, Int> {
    return strings.associate { it.reversed() to it.length }
}

fun task6(strings: List<String>): List<String> {
    return strings.sorted()
}

fun task7(strings: List<String>): List<String> {
    return strings.take(3)
}

fun task8(numbers: List<Int>): List<Int> {
    return numbers.map { it * it }
}

fun task9(strings: List<String>): Map<Char, List<String>> {
    return strings.groupBy { it.first() }
}

fun task10(strings: List<String>): List<String> {
    return strings.distinct()
}

fun task11(strings: List<String>): List<String> {
    return strings.sortedDescending()
}

fun task12(strings: List<String>): List<String> {
    return strings.takeLast(3)
}

// 24. Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя конструкцию when
//Если коллекция пустая - “Пусто”
//Если количество элементов меньше пяти - “Короткая”
//Если коллекция начинается с 0 - “Стартовая”
//Если сумма всех чисел больше 10000 - “Массивная”
//Если среднее значение равно 10 - “Сбалансированная”
//Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//Если максимальное число меньше -10 - “Отрицательная”
//Если минимальное число больше 1000 - “Положительная”
//Если содержит одновременно числа 3 и 14 - “Пи***тая”
//Иначе - “Уникальная”
//Вызвать метод с данными, подходящими под каждую из веток
fun task24(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.first() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString(" ").length == 20 -> "Клейкая"
        numbers.max() < -10 -> "Отрицательная"
        numbers.min() > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// 25. Анализ учебных оценок
// Напиши функцию, которая принимает список чисел и возвращает список чисел.
// Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
fun task25(grades: List<Int>): List<Int> {
    return grades.filter { it >= 60 }
        .sorted()
        .take(3)
}

// 26. Создание каталога по первой букве
// Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - списком строк.
fun task26(strings: List<String>): Map<Char, List<String>> {
    return strings
        .map { it.lowercase() }
        .groupBy { it.first() }
}

// 27. Подсчёт средней длины слов в списке
// Напиши функцию, которая принимает список строк и возвращает строку.
// Цель: Перевести все слова в количество букв, подсчитать среднее значение.
// Вернуть форматированный текст с двумя знаками после запятой, используя функцию format и подходящий шаблон.
fun task27(strings: List<String>): String {
    val averageLength = strings.map { it.length }.average()
    return String.format("%.2f", averageLength)
}


// 28: Категоризация чисел
// Напиши функцию, которая принимает список чисел и возвращает словарь с ключами - строками и значениями - список чисел.
// Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
fun task28(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
}

// 29: Поиск первого подходящего элемента
// Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
// Цель: Найти первый возраст в списке, который соответствует условию (больше второго аргумента) и вернуть его, либо null если значения не нашлось.
fun task29(ages: List<Int?>, age: Int): Int? {
    return ages.firstOrNull { it != null && it > age }
}

fun main() {
    println(task24(listOf()))
    println(task24(listOf(1, 2, 3)))
    println(task24(listOf(0, 1, 2, 3, 4)))
    println(task24(listOf(8, 6000, 81344, 100000, 2000, 5)))
    println(task24(listOf(12, 10, 8, 15, 5)))
    println(task24(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    println(task24(listOf(-20, -15, -30, -50, -11)))
    println(task24(listOf(1001, 2000, 3000, 4000, 5000)))
    println(task24(listOf(3, 14, 1, 2, 5)))
    println(task24(listOf(1, 2, 3, 4, 5, 6)))


    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка",
        "Зеркало", "ковер", "Шкаф", "часы",
        "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга",
        "Фоторамка", "светильник", "Коврик", "вешалка",
        "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед",
        "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )
    println(task26(list))

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(task25(grades))

    println(task27(list))

    println(task28(listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)))

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(task29(ages, 18))
}

