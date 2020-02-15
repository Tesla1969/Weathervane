package com.edgesoftware.loginverification

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val verification = LoginVerification()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun loginSuccessful_whenCorrectCredentials(){
        assertTrue(verification.verifyCredentials("test@edgesoftware.com", "123"))
    }
}
