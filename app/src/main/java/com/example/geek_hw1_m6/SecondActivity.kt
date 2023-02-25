package com.example.geek_hw1_m6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geek_hw1_m6.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: SecondActivityBinding

    companion object {
        const val editName: String = "edit_text"
        const val editResult: String = "result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etSendText.setText(intent.getStringExtra(editName))

        binding.btnSend.setOnClickListener {
            setResult(
                RESULT_OK, Intent().putExtra(
                    editResult,
                    binding.etSendText.text.toString()
                )
            )
            finish()
        }
    }
}