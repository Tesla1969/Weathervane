package com.edgesoftware.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return email == "dacuff@edgesoftware.com" &&
                password == "123"
    }
}
