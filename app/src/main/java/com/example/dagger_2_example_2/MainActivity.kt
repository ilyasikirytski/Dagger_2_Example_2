package com.example.dagger_2_example_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    dependency injection on constructor level
//    private var car: Car = DaggerDaggerComponent.create().getCar()

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        lateinit inject "set"-er for "key" field in "Car" class
        DaggerDaggerComponent.create().inject(this)

        car.startCar()
        Log.i("MSG", car.toString())
    }
}

