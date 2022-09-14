package com.artem.lesson16

import com.artem.lesson10.Person

class IteratesRunner {

    static void main(String[] args) {
        assert [1, 4, 7, 9].any { it % 2 == 0 }
        assert [1, 4, 7, 9].find { it % 2 == 0 } == 4
        assert [1, 4, 7, 9].findAll { it % 2 != 0 } == [1, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        def person = new Person(25)
        person.each { println it }

        ['asd', 'dsf', '123', '546', '234df'].grep(~/\d+/).each { println it }
        assert ['asd', 'dsf', '123', '546', '234df'].grep { it.length() > 4 } == ['234df']
    }
}
