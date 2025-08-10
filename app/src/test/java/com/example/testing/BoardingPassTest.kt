package com.example.testing

import com.example.testing.app.generateBoardingPass
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

/**
 * Created by Ismaeinz (https://github.com/ismaeinz)
 *
 * Date: 10 Aug 2025 at 20:31
 */
class BoardingPassTest {
    @Before
    fun setup() {
        println("Before")
    }

    @Test

    fun testGeneratedBoarding() {
        val inputWeight = 31
        val inputSize = "M"
        val expectedOutput = "32M"
        val actualOutput = generateBoardingPass(inputWeight, inputSize)
        assertEquals(expectedOutput, actualOutput)
        assertFalse(expectedOutput == actualOutput)
    }

}