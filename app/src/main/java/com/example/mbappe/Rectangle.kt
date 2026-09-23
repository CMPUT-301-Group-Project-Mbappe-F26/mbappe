package com.example.mbappe

class Rectangle(length: Int, width: Int): Shape(length, width) {
    fun Area(length: Int, width: Int): Int {
        return (length*width)
    }
}