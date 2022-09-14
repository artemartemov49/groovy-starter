package com.artem.lesson7

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 *
 */

def name = "Ivan"
char value = 'H'

stringValue = "Hello $name"

value2 = """
SELECT *
FROM 
table where name = ${getWithPrefix(name)}?
"""


value3 = """
SELECT *
FROM 
table where name = $name?
"""

println value2

def value4 = /Hello world $name/

println value4
def value6 = $/Hello world $name/$
println value6

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Iv'
println name - 'na'

static def getWithPrefix(String name) {
    "prefix-" + name
}
