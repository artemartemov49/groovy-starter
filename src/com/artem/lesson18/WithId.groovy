package com.artem.lesson18

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }

}