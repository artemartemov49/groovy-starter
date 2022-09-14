package com.artem.practice.task2

class CalculatorRunner {

    static Map<String, Integer> map = [
            'mm': 1,
            'cm': 10,
            'dm': 100,
            'm' : 1000,
            'km': 1000000,

    ]

    static void main(String[] args) {
        Integer.metaClass {
            getCm = {
                delegate * 10
            }

            getM = {
                delegate.cm * 100
            }

            getMm = {
                delegate
            }
        }

//        Integer.metaClass.propertyMissing { name ->
//            delegate * map.get(name)
//        }

        println 3.cm + 1.m - 25.mm
    }
}
