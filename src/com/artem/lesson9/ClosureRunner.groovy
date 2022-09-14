package com.artem.lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {

    static void main(String[] args) {
        Function<Integer, Integer> func = value -> value + value
        def result = func.apply(5)
//        println result
        Closure closure = { value = 78 ->
            println value
            value + value
        }
        println 'closure: ' + closure(5)

        Stream.of(1, 2, 3, 4)
//                .map(value -> value + value)
                .map(closure)
                .map(String.&valueOf)
//                .map(String::valueOf)
                .forEach(System.out::println)

        int x = 10
        check(x > 0) { println 'check ' + ++x }
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
