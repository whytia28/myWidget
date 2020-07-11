package com.example.mywidgets


internal object NumberGenerator {

    fun generate(max: Int): Int {
        val random = java.util.Random()
        return random.nextInt(max)
    }
}