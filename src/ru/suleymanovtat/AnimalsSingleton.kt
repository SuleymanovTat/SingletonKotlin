package ru.suleymanovtat

class AnimalsSingleton {

    companion object {
        var cat: String = "cat"
        var dog: String = "dog"
    }

    fun getAnimals() = cat + " " + dog
}