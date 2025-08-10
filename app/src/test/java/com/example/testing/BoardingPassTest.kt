package com.example.testing

import com.example.testing.app.BagApi
import com.example.testing.app.generateBoardingPass
import io.mockk.every
import io.mockk.mockk
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

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
        val inputWeight = 32
        val api = mockk<BagApi>()

        every { api.getBagSize(2) } returns "M"
        val repository = BagApi.PassengerRepository(api)
        val inputSize = repository.getPassengerBagSize(2)
        val expectedOutput = "32M"
        val actualOutput = generateBoardingPass(inputWeight, inputSize)
        assertEquals(expectedOutput, actualOutput)
//        assertFalse(expectedOutput == actualOutput)
    }

}