package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edittext.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        binding.btnTampilkan3.setOnClickListener(){
            ubahData()
        }
        setContentView(binding.root)
    }
    private fun ubahData(){
        var angka1 = binding.etName3.text.toString().toInt()
        var angka2 = angka1 * 10
        binding.tvHasil3.text = angka2.toString()
    }
}