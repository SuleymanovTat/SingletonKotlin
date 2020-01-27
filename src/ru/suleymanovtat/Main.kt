package ru.suleymanovtat

fun main() {
    JustSingleton.name = "Ilmir"
    JustSingleton.lastName = "Suleymanov"

    println(JustSingleton.name)
    println(JustSingleton.lastName)
    println(JustSingleton.getUserName())


    println(AnimalsSingleton.cat + " " + AnimalsSingleton.dog)
    println(AnimalsSingleton().getAnimals())
    println(AnimalsSingleton())
}