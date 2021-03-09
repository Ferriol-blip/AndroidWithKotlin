package es.ferriolblip.firstapp

import android.content.Intent
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
        //OLD
        //setContentView(R.layout.activity_main)
        //NEW
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //OLD
        //val button = findViewById<Button>(R.id.btnShowName)
        //NEW
        binding.btnShowName.setOnClickListener { checkValue() }
    }

    private fun checkValue() {
        if (binding.etName.text.isNotBlank() ||  binding.etName.text.isNotEmpty() ){
            //Intent sirve como vinculación, en este caso hará un bundle con lo que le indiquemos, en este caso un valor de un comp
            val intent = Intent(this,ResultActivity::class.java) //Se especifica el context al que se dirige?
            //Sintaxis funcion putExtra("ID_QUE_QUERAMOS",componente)
            //Similar a las promesas, podemos encadenar el apply que ocurrira a continuación o ponerlo en la siguiente línea.
            //Con startActivity, como su nombre indica iniciara la actividad nueva donde le pasamos el Intent.
            intent.putExtra("INTENT_NAME",binding.etName.text).apply{startActivity(intent) }
        }else{
            showErrorName()
        }
    }

    private fun showErrorName(){
        Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT).show()
    }
}