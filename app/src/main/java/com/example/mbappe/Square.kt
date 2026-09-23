package com.example.mbappe

class Square(side: Int) : Shape(side, side) {
    fun area(side: Int): Int {
        return side * side
    }
}