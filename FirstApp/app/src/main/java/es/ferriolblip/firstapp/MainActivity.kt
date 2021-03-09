package es.ferriolblip.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import es.ferriolblip.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var switchE : Switch
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSend.setOnClickListener() { getData() }
        //switchE = binding.swVehiculo
    }


    private fun getData() {
        if (check()) {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra("intent_name", binding.etName.text)
                .putExtra("intent_surname", binding.etSurname.text)
                .putExtra("intent_vehiculo", binding.swVehiculo.text)
                .putExtra("intent_student", binding.swStudent.text)
                .apply { startActivity(intent) }
        }
    }

    private fun check(): Boolean {
        return true
    }

}
