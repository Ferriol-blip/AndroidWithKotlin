package es.ferriolblip.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import es.ferriolblip.firstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //Add viewBinding
    //se crea la variable binding con lateinit de tipo Activity..
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Ahora se inflara (inflate) la vista de otra manera con la nueva metodología
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val button = findViewById<Button>(R.id.btnShowName)
        binding.btnShowName.setOnClickListener { toast() }

    }

    private fun toast() {
        Toast.makeText(this, "Hola!", Toast.LENGTH_SHORT).show()
    }

}