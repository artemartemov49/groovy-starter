package com.artem.lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
        def file = new File('.gitignore')
//        println file.text
//
//        file.each { line -> println line }
//        file.withInputStream {
//            def allTest = new String(it.readAllBytes())
//            println allTest
//        }

        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

        def file2 = new File('text.txt')
        file2.text = 'Some text'
        file2 << 'New line' << System.lineSeparator()


        def srcDir = new File('src')
        srcDir.eachFile(FileType.ANY) { println it }
    }
}
