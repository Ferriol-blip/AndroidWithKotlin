package es.ferriolblip.consumiendoapi

import com.google.gson.annotations.SerializedName

//data class, se le pasan los valores por parametros, los sn de las varaibles, o por contra las variables que se le pasan, tienen
//que llamarse igual a los headers del json <- Como en ract, don't forget
data class ImgResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var image: List<String>
)