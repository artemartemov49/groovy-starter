package com.artem.lesson15

class RangeRunner {
    static void main(String[] args) {
        def range = 2..<8
        assert range.getClass() == IntRange

        assert range.get(3) == 5
        assert !range.contains(8)

        range.each { println it }
        println '----------'
        ('a'..'d').each { println it }
        println '----------'
        (WeekDay.WE..WeekDay.MO).each { println it }
    }
}
