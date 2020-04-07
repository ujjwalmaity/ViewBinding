package dev.ujjwal.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.ujjwal.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = binding.editText.text
            binding.editText.setText("")
        }
    }
}
