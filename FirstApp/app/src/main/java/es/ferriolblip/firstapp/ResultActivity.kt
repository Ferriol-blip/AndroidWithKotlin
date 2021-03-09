package es.ferriolblip.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.ferriolblip.firstapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener{onBackPressed()}
        getValue()
    }

    private fun getValue(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        binding.tvValue.text = "You have passed a value: $name"
    }
}