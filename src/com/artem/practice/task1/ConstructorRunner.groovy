package com.artem.practice.task1

import com.artem.lesson17.Student

class ConstructorRunner {
    static void main(String[] args) {
        Class.metaClass.make = { Object... arguments ->
            println thisObject
            println owner
            println delegate
        }


        Student.make()
    }
}
