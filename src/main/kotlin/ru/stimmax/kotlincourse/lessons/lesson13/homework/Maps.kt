package ru.stimmax.kotlincourse.lessons.lesson13.homework

// 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
// 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
// 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
// 4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
// 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
// 6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
// 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
// 8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
// 9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
// 10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
// 11. Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
// 12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
// 13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
// 14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
// 15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
// 16. Объедините два неизменяемых словаря с данными о багах.
// 17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
// 18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
// 19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
// 20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
// 21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
// 22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
// 23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
// 24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
// 25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
// 26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
// 27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
// 28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.

fun task1(testTimes: Map<String, Int>): Double {
    return testTimes.values.average()
}

fun task2(testMetadata: Map<String, String>): List<String> {
    return testMetadata.keys.toList()
}

fun task3(testResults: MutableMap<String, String>, testName: String, result: String) {
    testResults[testName] = result
}

fun task4(testResults: Map<String, String>): Int {
    return testResults.values.count { it == "passed" }
}

fun task5(bugTracking: MutableMap<String, String>, bugName: String) {
    bugTracking.remove(bugName)
}

fun task6(pageResults: Map<String, Int>) {
    pageResults.forEach { (url, status) ->
        println("Страница: $url, статус: $status")
    }
}

fun task7(responseTimes: Map<String, Int>, threshold: Int): Map<String, Int> {
    return responseTimes.filter { it.value > threshold }
}

fun task8(apiResults: Map<String, String>, endpoint: String): String {
    return apiResults.getOrDefault(endpoint, "Not tested")
}

fun task9(config: Map<String, String>): String {
    return config.getValue("browserType")
}

fun task10(versions: Map<String, String>, version: String, value: String): Map<String, String> {
    return versions + (version to value)
}

fun task11(deviceSettings: Map<String, String>, model: String): String {
    return deviceSettings.getOrDefault(model, "Default settings")
}

fun task12(errors: Map<Int, String>, errorCode: Int): Boolean {
    return errors.containsKey(errorCode)
}

fun task13(testScenarios: Map<String, String>, version: String): Map<String, String> {
    return testScenarios.filterKeys { it.contains(version) }
}

fun task14(moduleResults: Map<String, String>): Boolean {
    return moduleResults.values.any { it == "failed" }
}

fun task15(settings: MutableMap<String, String>, newSettings: Map<String, String>) {
    settings.putAll(newSettings)
}

fun task16(bugs1: Map<String, String>, bugs2: Map<String, String>): Map<String, String> {
    return bugs1 + bugs2
}

fun task17(testData: MutableMap<String, String>) {
    testData.clear()
}

fun task18(testResults: Map<String, String>): Map<String, String> {
    return testResults.filterValues { it != "skipped" }
}

fun task19(config: Map<String, String>, keys: List<String>): Map<String, String> {
    return config.filterKeys { it !in keys }
}

fun task20(testResults: Map<String, String>): List<String> {
    return testResults.map { (id, result) -> "$id: $result" }
}

fun task21(testResults: MutableMap<String, String>): Map<String, String> {
    return testResults.toMap()
}

fun task22(testTimes: Map<Int, Int>): Map<String, Int> {
    return testTimes.mapKeys { it.key.toString() }
}

fun task23(performance: Map<String, Double>): Map<String, Double> {
    return performance.mapValues { it.value * 1.1 }
}

fun task24(compilationErrors: Map<String, String>): Boolean {
    return compilationErrors.isEmpty()
}

fun task25(loadResults: Map<String, String>): Boolean {
    return loadResults.isNotEmpty()
}

fun task26(testResults: Map<String, String>): Boolean {
    return testResults.values.all { it == "passed" }
}

fun task27(testResults: Map<String, String>): Boolean {
    return testResults.values.any { it == "failed" }
}

fun task28(testResults: Map<String, String>): Map<String, String> {
    return testResults.filter { (name, result) ->
        name.contains("optional") && result != "passed"
    }
}

fun main() {
    val testTimes = mapOf<String, Int>(
        "RegistrationTest" to 5,
        "LoginTest" to 3,
        "PaymentTest" to 8
    )
    println(task1(testTimes))

    val testMetadata = mapOf<String, String>(
        "RegistrationTest" to "Functional",
        "LoginTest" to "Security",
        "PaymentTest" to "Performance"
    )
    println(task2(testMetadata))

    val testResults = mutableMapOf<String, String>(
        "RegistrationTest" to "passed",
        "LoginTest" to "failed",
        "PaymentTest" to "skipped"
    )
    task3(testResults, "PaymentTest", "passed")
    println(testResults)

    print(task4(testResults))

    val bugTracking = mutableMapOf<String, String>("Bug1" to "open", "Bug2" to "fixed", "Bug3" to "in progress")
    task5(bugTracking, "Bug2")
    println(bugTracking)

    val pageResults = mapOf("/home" to 200, "/login" to 404, "/dashboard" to 500)
    task6(pageResults)

    val responseTimes = mapOf("ServiceA" to 150, "ServiceB" to 300, "ServiceC" to 80)
    println(task7(responseTimes, 100))

    val apiResults = mapOf("/api/v1/users" to "200 OK", "/api/v1/admin" to "403 Forbidden")
    println(task8(apiResults, "/api/v1/users"))
    println(task8(apiResults, "/api/v1/guest"))

    val config = mapOf("browserType" to "Chrome", "headless" to "true")
    println(task9(config))

    val versions = mapOf("1.0" to "Stable", "1.1" to "Beta")
    println(task10(versions, "1.2", "Alpha"))

    val deviceSettings = mapOf("Pixel 7" to "Dark Mode", "iPhone 14" to "Light Mode")
    println(task11(deviceSettings, "Pixel 7"))
    println(task11(deviceSettings, "Galaxy S23"))

    val errors = mapOf(404 to "Not Found", 500 to "Server Error")
    println(task12(errors, 404))
    println(task12(errors, 403))

    val testScenarios = mapOf("TestID_v1.0_Login" to "Passed", "TestID_v2.0_Logout" to "Failed")
    println(task13(testScenarios, "v1.0"))

    val moduleResults = mapOf("Auth" to "passed", "Billing" to "failed", "Profile" to "passed")
    println(task14(moduleResults))

    val settings = mutableMapOf("timeout" to "30", "retries" to "3")
    val newSettings = mapOf("threads" to "4", "timeout" to "60")
    task15(settings, newSettings)
    println(settings)

    val bugs1 = mapOf("Bug1" to "Critical", "Bug2" to "Major")
    val bugs2 = mapOf("Bug3" to "Minor", "Bug4" to "Trivial")
    println(task16(bugs1, bugs2))

    val testData = mutableMapOf("runId" to "12345", "status" to "running")
    task17(testData)
    println(testData)

    val reportResults = mapOf("Test1" to "passed", "Test2" to "skipped", "Test3" to "failed")
    println(task18(reportResults))

    val baseConfig = mapOf("env" to "staging", "browser" to "Firefox", "timeout" to "20")
    println(task19(baseConfig, listOf("timeout", "browser")))

    val testResultMap = mapOf("T1" to "passed", "T2" to "failed")
    println(task20(testResultMap))

    val mutableResults = mutableMapOf("T1" to "passed", "T2" to "skipped")
    println(task21(mutableResults))

    val testTimesById = mapOf(101 to 5, 102 to 12)
    println(task22(testTimesById))

    val performance = mapOf("v1.0" to 1.5, "v2.0" to 1.2)
    println(task23(performance))

    val compilationErrors = mapOf<String, String>()
    println(task24(compilationErrors))

    val loadResults = mapOf("loadTest1" to "success")
    println(task25(loadResults))

    val allPassed = mapOf("T1" to "passed", "T2" to "passed")
    println(task26(allPassed))

    val anyFailed = mapOf("T1" to "passed", "T2" to "failed")
    println(task27(anyFailed))

    val optionalTests = mapOf("optional_login" to "failed", "optional_search" to "passed", "mandatory_test" to "failed")
    println(task28(optionalTests))
}