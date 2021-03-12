package es.ferriolblip.consumiendoapi

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ferriolblip.consumiendoapi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    private fun getRetrofit():Retrofit{
        //la funcion devolvera un objeto de tipo retrofit, donde configuraremos
        //con el builder
        //la peticion con la URL y donde añadiremos la conversion.
        return  Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            //Uso de la libreria converter de retrofit
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByName(query:String){
        //Las corutinas sirven para trabajar de forma Async.
        CoroutineScope(Dispatchers.IO).launch {
            //El codigo dentro de la corutina se ejecutara de forma Aync (otro hilo a parte del padre)
            val call = getRetrofit()
                .create(APIService::class.java)
                .getDogsByBreeds("$query/images")

            val dogs = call.body()
            if(call.isSuccessful){
                //show
            }else{
                //showError
            }
        }
    }
}