package com.example.practice10

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addition() {
        Assert.assertEquals(23, calculator!!.add(11, 12))
    }

    @Test
    fun substraction() {
        Assert.assertEquals(-33, calculator!!.subtract(11, 44))
    }

    @Test
    fun multiplication() {
        Assert.assertEquals(-12, calculator!!.multiply(3, -4))
    }

    @Test
    fun divisionBy0() {
        Assert.assertEquals(0, calculator!!.divide(12, 0))
    }

    @Test
    fun division() {
        Assert.assertEquals(4, calculator!!.divide(12, 3))
    }

    @Test
    fun wholeCalculator() {
        Assert.assertEquals(-15, calculator!!.add(-17, 2))
        Assert.assertEquals(-1, calculator!!.subtract(3, 4))
        Assert.assertEquals(12, calculator!!.multiply(-3, -4))
        Assert.assertEquals(0, calculator!!.divide(0, 0))
        Assert.assertEquals(4, calculator!!.divide(13, 3))
    }

    @After
    fun tearDown() {
        calculator = null
    }
}
