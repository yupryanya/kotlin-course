package ru.stimmax.kotlincourse.lessons.lesson10.homework

import java.time.LocalDate

/*
1. Словарь библиотека: Ключи - автор книги, значения - список книг
2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
*/

fun main() {
    val map1 = mutableMapOf<String, MutableList<String>>()

    val map2 = mapOf<String, MutableList<String>>()

    val map3 = mutableMapOf<String, MutableList<String>>()

    val map4 = mutableMapOf<LocalDate, MutableList<String>>()

    val map5 = mapOf<String, MutableMap<String, MutableList<String>>>()
}