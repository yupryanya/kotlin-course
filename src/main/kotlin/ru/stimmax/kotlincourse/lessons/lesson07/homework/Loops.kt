package ru.stimmax.kotlincourse.lessons.lesson07.homework

fun main() {
    println("Задания для цикла for / Прямой диапазон / 1")
    for (i1 in 1..5) {
        println(i1)
    }

    println("Задания для цикла for / Прямой диапазон / 2")
    for (i2 in 2..10 step 2) {
        println(i2)
    }

    println("Задания для цикла for / Обратный диапазон / 3")
    for (i3 in 5 downTo 1) {
        println(i3)
    }

    println("Задания для цикла for / Обратный диапазон / 4")
    for (i4 in 10 downTo 1 step 2) {
        println(i4)
    }

    println("Задания для цикла for / С шагом (step) / 5")
    for (i5 in 1..9 step 2) {
        println(i5)
    }

    println("Задания для цикла for / С шагом (step) / 6")
    for (i6 in 1..20 step 3) {
        println(i6)
    }

    println("Задания для цикла for / Использование до (until) / 7")
    val size = 10
    for (i7 in 3 until size step 2) {
        println(i7)
    }

    println("Задания для цикла while / Цикл while / 8")
    var i8 = 1
    while (i8 <= 5) {
        println(i8 * i8)
        i8++
    }

    println("Задания для цикла while / Цикл while / 9")
    var i9 = 10
    while (i9 > 5) {
        i9--
    }
    println(i9)

    println("Задания для цикла while / Цикл do while / 10")
    var i10 = 5
    do {
        println(i10)
        i10--
    } while (i10 >= 1)

    println("Задания для цикла while / Цикл do while / 11")
    var i11 = 5
    do {
        println(i11)
        i11++
    } while (i11 < 10)

    println("Задания для прерывания и пропуска итерации / Использование break / 12")
    for (i12 in 1..10) {
        println(i12)
        if (i12 == 6) {
            break
        }
    }

    println("Задания для прерывания и пропуска итерации / Использование break / 13")
    var i13 = 1
    while (true) {
        println(i13)

        if (i13 == 10) {
            break
        }

        i13++
    }

    println("Задания для прерывания и пропуска итерации / Использование continue / 14")
    for (i14 in 1..10) {
        if (i14 % 2 == 0) {
            continue
        }
        println(i14)
    }

    println("Задания для прерывания и пропуска итерации / Использование continue / 15")
    var i15 = 1
    while (i15 <= 10) {
        if (i15 % 3 == 0) {
            i15++
            continue
        }

        println(i15)
        i15++
    }
}