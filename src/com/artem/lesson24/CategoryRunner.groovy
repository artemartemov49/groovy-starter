package com.artem.lesson24

import com.artem.lesson17.Student

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 17, firstName: 'Ivan')
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("Test arg")
        }


    }
}
