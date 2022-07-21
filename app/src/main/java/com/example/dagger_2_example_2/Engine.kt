package com.example.dagger_2_example_2

import android.util.Log
import javax.inject.Inject
import javax.inject.Provider
import dagger.Lazy
// Lazy return previously cached instance of the object each time it's called
class Engine @Inject constructor(private var fuel: Lazy<Fuel>) {
    fun start() {
//
        if (fuel != null) {
            Log.i("MSG","Started with ${fuel.get().fuelType}!")
        } else {
            Log.i("MSG","No more fuel!")
        }
    }

    override fun toString(): String {
//       to get toString return of "Fuel" class -> put ${fuel.get()} in this return
        return "V8 + ${fuel.get()}"
    }
}