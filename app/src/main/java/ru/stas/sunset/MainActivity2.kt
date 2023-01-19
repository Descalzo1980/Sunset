package ru.stas.sunset

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import ru.stas.Person
import ru.stas.sunset.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val userData = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra("Person", Person::class.java)
        } else {
            intent.getParcelableExtra<Person>("Person")
        }


        binding.textView.text = userData.toString()
    }
}