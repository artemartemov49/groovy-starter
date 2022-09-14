package com.artem.lesson27

class MailSpecification {
    String from
    String to
    String title
    BodySpecification body

    def from(String from) {
        setFrom(from)
    }

    def to(String to) {
        setTo(to)
    }

    def title(String title) {
        setTitle(title)
    }

    def body(@DelegatesTo(BodySpecification) Closure closure) {
        body = new BodySpecification()
        body.with closure
    }
}
