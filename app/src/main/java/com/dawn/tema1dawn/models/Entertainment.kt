package com.temadawn.models

enum class Type(val key: Int) {
    animals(0),
    animal_af(1),
    animal_am(2),
    animal_as(3),
    animal_au(4)
}

open class Entertainment (val type: Type)