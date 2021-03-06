package com.barasan.myhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.barasan.myhilt.module.qualifier.Hashcode
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var singletonClass: SingletonClass

    @Hashcode
    @Inject
    lateinit var hashcode: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("singleton", singletonClass.hashCode().toString())
        Log.d("singleton", "hashcode: $hashcode")
    }
}

