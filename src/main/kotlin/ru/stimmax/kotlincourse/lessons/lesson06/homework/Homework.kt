package ru.stimmax.kotlincourse.lessons.lesson06.homework

// Задание 1: "Определение сезона"
fun printSeason(month: Int) {
    val season = when (month) {
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        else -> "Invalid month"
    }
    println("Month: $month, Season: $season")
}

// Задание 2: "Расчет возраста питомца"
fun printDogAgeToHumanAge(dogAge: Double) {
    if (dogAge < 0) {
        println("Invalid dog age: $dogAge")
        return
    }

    val humanAge = when {
        dogAge <= 2 -> dogAge * 10.5
        else -> 2 * 10.5 + (dogAge - 2) * 4
    }

    println("Pet age: $dogAge, Human age: $humanAge")
}

// Задание 3: "Определение способа перемещения"
fun printTransport(distance: Double) {
    val transport = when {
        distance < 0 -> "Invalid distance"
        distance <= 1 -> "Пешком"
        distance <= 5 -> "Велосипед"
        else -> "Автотранспорт"
    }

    println("Distance: $distance km, Transport: $transport")
}

// Задание 4: "Расчет бонусных баллов"
fun printBonusPoints(purchaseAmount: Double) {
    if (purchaseAmount < 0) {
        println("Invalid purchase amount: $purchaseAmount")
        return
    }

    val bonusPoints = if (purchaseAmount <= 1000) {
        (purchaseAmount / 100).toInt() * 2
    } else {
        20 + ((purchaseAmount - 1000) / 100).toInt() * 3
    }

    println("Purchase: $purchaseAmount, Bonus points: $bonusPoints")
}

// Задание 5: "Определение типа документа"
fun printDocumentType(extension: String) {
    val documentType = when (extension.lowercase()) {
        "txt", "doc", "docx", "odt" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif" -> "Изображение"
        "xls", "xlsx", "csv", "ods" -> "Таблица"
        else -> "Неизвестный тип"
    }

    println("Extension: $extension, Type: $documentType")
}

// Задание 6: "Конвертация температуры"
fun printConvertedTemperature(temperature: Double, unit: String) {
    val converted = when (unit.uppercase()) {
        "C" -> temperature * 9 / 5 + 32
        "F" -> (temperature - 32) * 5 / 9
        else -> println("Invalid unit: $unit")
    }
    print("Temperature: $temperature$unit, Converted: $converted")

    if (unit.uppercase() == "C") {
        print("F")
    } else {
        print("C")
    }
    println()
}

// Задание 7: "Подбор одежды по погоде"
fun printClothesRecommendation(temperature: Int) {
    val recommendation = when {
        temperature < -30 || temperature > 35 -> "Не выходить из дома"
        temperature < 10 -> "Куртка и шапка"
        temperature <= 18 -> "Ветровка"
        else -> "Футболка и шорты"
    }

    println("Temperature: $temperature°C, Recommendation: $recommendation")
}

// Задание 8: "Выбор фильма по возрасту"
fun printMovieCategory(age: Int) {
    val category = when {
        age < 0 -> "Некорректный возраст"
        age <= 9 -> "Детские"
        age <= 18 -> "Подростковые"
        else -> "18+"
    }
    println("Category: $category")
}

fun main() {
    // Задание 1
    printSeason(0)
    for (month in 1..12) printSeason(month)
    printSeason(13)

    // Задание 2
    printDogAgeToHumanAge(-1.0)
    printDogAgeToHumanAge(0.0)
    printDogAgeToHumanAge(1.0)
    printDogAgeToHumanAge(2.0)
    printDogAgeToHumanAge(2.5)

    // Задание 3
    printTransport(-1.0)
    printTransport(0.0)
    printTransport(1.0)
    printTransport(5.0)
    printTransport(5.1)

    // Задание 4
    printBonusPoints(-100.0)
    printBonusPoints(0.0)
    printBonusPoints(99.0)
    printBonusPoints(1000.0)
    printBonusPoints(1001.0)

    // Задание 5
    printDocumentType("DOCX")
    printDocumentType(".png")
    printDocumentType("")
    printDocumentType("unknown")

    // Задание 6
    printConvertedTemperature(0.0, "c")
    printConvertedTemperature(32.0, "F")
    printConvertedTemperature(100.0, "K")

    // Задание 7
    printClothesRecommendation(-31)
    printClothesRecommendation(-30)
    printClothesRecommendation(10)
    printClothesRecommendation(18)
    printClothesRecommendation(35)
    printClothesRecommendation(36)

    // Задание 8
    printMovieCategory(-1)
    printMovieCategory(0)
    printMovieCategory(9)
    printMovieCategory(10)
    printMovieCategory(18)
    printMovieCategory(19)
}