package ru.stimmax.kotlincourse.lessons.lesson10.homework

/*
1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
6. Удалите определенный элемент из изменяемого словаря по его ключу.
7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
8. Измените значение для существующего ключа в изменяемом словаре.
9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
 */
fun main() {
    val map1 = emptyMap<Int, Int>()

    val map2 = mapOf(1.1f to 10.1, 2.2f to 20.2, 3.3f to 30.3)

    val map3: MutableMap<Int, String> = mutableMapOf()

    val map4: MutableMap<String, Double> = mutableMapOf()
    map4["apple"] = 150.4
    map4["banana"] = 200.5
    map4["orange"] = 300.6

    val value = map4["banana"]
    val valueNotFound = map4["grape"]

    map4.remove("orange")

    val map7 = mapOf(10.0 to 2, 20.0 to 4, 30.0 to 0)
    for ((key, value) in map7) {
        val result = if (value != 0) key / value else "бесконечность"
        println("$key / $value = $result")
    }

    val map8 = mutableMapOf("key1" to "value1", "key2" to "value2")
    map8["key1"] = "newValue1"

    val map9a = mapOf("a" to 1, "b" to 2)
    val map9b = mapOf("c" to 3, "d" to 4)
    val map9 = mutableMapOf<String, Int>()

    for ((key, value) in map9a) {
        map9[key] = value
    }
    for ((key, value) in map9b) {
        map9[key] = value
    }

    val map10 = mutableMapOf<String, List<Int>>()
    map10["first"] = listOf(1, 2, 3)
    map10["second"] = listOf(4, 5, 6)

    val map11 = mutableMapOf<Int, MutableSet<String>>()
    map11[1] = mutableSetOf("A", "B")
    map11[2] = mutableSetOf("C", "D")
    val value11 = map11[1]

    value11?.add("E")
    println(value11)

    val map12 = mapOf(Pair(1, 5) to "value1", Pair(2, 3) to "value2", Pair(5, 4) to "value3")
    for ((key, value) in map12) {
        if (key.first == 5 || key.second == 5) {
            println("Key: $key, Value: $value")
        }
    }

