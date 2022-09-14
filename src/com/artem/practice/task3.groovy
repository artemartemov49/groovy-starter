package com.artem.practice

class task3 {
    static void main(String[] args) {
//        given(Closure {}).when(Closure {}).then(Closure {})

        given {
            a = 2
            b = 4
        } when {
            result = a + b
        } then {
            assert result == 6
        }
    }

    static def given(Closure closure) {
        def valueHolder = [:]
        closure.delegate = valueHolder
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        ['when': { Closure whenClosure ->
            {
                whenClosure.delegate = valueHolder
                whenClosure()
                ['then': { Closure thenClosure ->
                    {
                        thenClosure.delegate = valueHolder
                        thenClosure()
                    }
                }]
            }
        }]
    }


}
