package com.example.dagger_2_example_2

import javax.inject.Inject

class Fuel @Inject constructor() {
    val fuelType = if (BuildConfig.DEBUG) {
        "gasoline"
    } else {
        "diesel"
    }

    override fun toString(): String {
        return fuelType
    }
}