package es.ferriolblip.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ferriolblip.firstapp.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getName()
    }

    private fun getName(){
        val bundle = intent.extras
        val name = bundle?.get("intent_name")
        binding.tvName.text = "Nombre: $name"
        val surname = bundle?.get("intent_surname")
        binding.tvSurname.text = "Apellido: $surname"

        val gender=bundle?.get("intent_genderM")
        val student=bundle?.get("intent_student")
        binding.tvGender.text = "Genero: $gender"
        binding.tvStudent.text = "Genero: $student"

    }
}