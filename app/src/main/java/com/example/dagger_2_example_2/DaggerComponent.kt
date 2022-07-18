package com.example.dagger_2_example_2

import dagger.Component

@Component
interface DaggerComponent {
    fun getCar(): Car
    fun getEngine(): Engine
    fun getFuel(): Fuel

    fun inject(mainAct: MainActivity)
}