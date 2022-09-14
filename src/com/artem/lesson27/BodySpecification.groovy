package com.artem.lesson27

class BodySpecification {
    String text
    List<String> images = []

    def text(String text) {
        setText(text)
    }

    def images(List<String> images) {
        this.images += images
    }

    def image(String image) {
        images << image
    }
}
