package com.artem.lesson22

import com.artem.lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MetaClassRunner {
    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
        println 'Hello'
        def method = DefaultGroovyMethods.class.getMethod('println', Object.class, Object.class)
        customMetaClass.methods.put('println', method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get('println')
        printlnMethod.invoke(student, student, "Test 2")

        println student.metaClass
//        println student.metaClass.methods
//        ExpandoMetaClass
        student.metaClass.abc = 'Test property'
        student.metaClass.test = {
            println "it's a new method"
        }

        student.test()
        student.class.metaClass.newMethod = { int value ->
            println "new method in class Student $value"
        }
//        student.newMethod(25)
        new Student().newMethod(25)
        println student.metaClass

//        ProxyMetaClass - interceptors

    }
}
