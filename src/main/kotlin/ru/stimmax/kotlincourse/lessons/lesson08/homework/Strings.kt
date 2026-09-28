package ru.stimmax.kotlincourse.lessons.lesson08.homework

fun transformPhrase(phrase: String): String {
    var result = phrase

    if (result.contains("невозможно")) {
        result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }
    if (result.startsWith("Я не уверен")) {
        result += ", но моя интуиция говорит об обратном"
    }
    if (result.contains("катастрофа")) {
        result = result.replace("катастрофа", "интересное событие")
    }
    if (result.endsWith("без проблем")) {
        result = result.replace("без проблем", "с парой интересных вызовов на пути")
    }
    if (!result.contains(" ") && result.isNotBlank()) {
        result = "Иногда, $result, но не всегда"
    }

    return result
}

fun parseLogDate(logLine: String) {
    val dateTimePart = logLine.split("->").last().trim()
    val parts = dateTimePart.split(" ")

    println("Дата: ${parts[0]}")
    println("Время: ${parts[1]}")
}

fun maskCreditCard(cardNumber: String): String {
    val tail = cardNumber.takeLast(4)
    return "*".repeat(cardNumber.length - 4) + tail
}

fun formatEmail(email: String): String {
    return email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")
}

fun extractFileName(path: String): String {
    return path.split("/").last()
}

fun createAbbreviation(phrase: String): String {
    val words = phrase.split(" ")
    var abbreviation = ""

    for (word in words) {
        abbreviation += word.first().uppercase()

    }

    return abbreviation
}

fun main() {
    println("Задание 1")
    println(transformPhrase("Это невозможно выполнить за один день"))

    println("Задание 2")
    parseLogDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println("Задание 3")
    println(maskCreditCard("4539 1488 0343 6467"))

    println("Задание 4")
    println(formatEmail("username@example.com"))

    println("Задание 5")
    println(extractFileName("C:/Пользователи/Документы/report.txt"))

    println("Задание 6")
    println(createAbbreviation("Котлин лучший язык программирования"))
}
