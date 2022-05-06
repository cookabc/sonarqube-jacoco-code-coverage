package com.chuangcius.service

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

class MathServiceTest {

    private var mathService: MathService? = null

    @Before
    fun setUp() {
        mathService = MathService()
    }

    @Test
    fun multipliesNumbers() {
        val result = mathService!!.multiply(2, 4)
        assertThat(result, equalTo(8))
    }
}