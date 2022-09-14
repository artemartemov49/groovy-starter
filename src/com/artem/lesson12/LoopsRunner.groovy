package com.artem.lesson12

class LoopsRunner {
    static void main(String[] args) {
//        while / for
        def list = [1, 2, 3, 4]
//        for (i in 0..list.size()) {
//            println i
//        }

//        for (Integer value : list) {
//            println value
//        }

//        for (value in list) {
//            println value
//        }

//        0.upto(list.size()) {
//            println it
//        }
//
//        list.size().downto(0) {
//            println it
//        }

//        list.size().times {
//            println it
//        }

        0.step(5, 2) { println it }
    }
}
