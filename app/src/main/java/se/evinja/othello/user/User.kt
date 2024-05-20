package se.evinja.othello.user

import javax.inject.Inject

interface User {
    fun isAuthenticated(): Boolean
    fun displayName(): String
}

class UserImpl @Inject constructor() : User {
    override fun isAuthenticated(): Boolean {
        return true
    }

    override fun displayName() = "Sven Svensson"
}
