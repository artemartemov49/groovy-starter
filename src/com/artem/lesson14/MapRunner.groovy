package com.artem.lesson14

class MapRunner {

    static void main(String[] args) {
//        def map = [:]
        def map = ['one': 1, 'two': 2]
        assert map.getClass() == LinkedHashMap

//        read
        assert map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        assert map.one == 1     // property missing
        assert map.get("ewwer", 10) == 10

//        write
        map.one = 111
        map.three = 3

//        new method
        assert map.subMap("one", "two") == ['one': 111, 'two': 2]

//        new operator
        def newMap = ['q':22, 'rt': 99, *:map]
        print newMap
    }
}
