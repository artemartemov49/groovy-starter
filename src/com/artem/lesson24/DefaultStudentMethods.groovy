package com.artem.lesson24

import com.artem.lesson17.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr() {
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
