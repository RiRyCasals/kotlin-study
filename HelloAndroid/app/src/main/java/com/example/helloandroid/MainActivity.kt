package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isTapToggleHead: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.tapHere.setOnClickListener {
            if (isTapToggleHead) {
                binding.textView.text = "ボタンがタップされました"
                isTapToggleHead = false
            } else {
                binding.textView.text = "タップするたびに表示が切り替わります"
                isTapToggleHead = true
            }
        }
    }
}