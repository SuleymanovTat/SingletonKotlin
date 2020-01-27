package ru.suleymanovtat

object JustSingleton {
    var name: String? = null
    var lastName: String? = null

    fun getUserName(): String {
        return name + " " + lastName
    }
}