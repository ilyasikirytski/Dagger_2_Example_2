package com.example.dagger_2_example_2

import javax.inject.Inject
import javax.inject.Provider
import dagger.Lazy
// Provider return new instance of the object each time it's called
class Car @Inject constructor(private var engine: Provider<Engine>) {
    var key: Key? = null
        @Inject set

    fun startCar(){
        engine.get().start()
    }

    override fun toString(): String {
//       to get toString return of "Engine" class -> put ${engine.get()} in this return
        return "${key?.keyName} + Car + ${engine.get()}"
    }
}