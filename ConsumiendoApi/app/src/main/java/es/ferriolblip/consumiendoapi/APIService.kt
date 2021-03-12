package es.ferriolblip.consumiendoapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

//Tendra el metodo de acceso a  consumir la appi
interface APIService {
    //Se indica el tipo de peticion
    @GET
    //Se crea la funcion, como parametro es ese caso se pasa el tipo @URL de Retrofit, como tipo String que es como estara en el JSON
    //Y la funcion devolvera un Response (tmb de retrofit) de tipo ImgResposne, que es la Data Class creada.
    //similar a las request y promesas de react, la sintaxis es parecida, el response el lo que devolera, similar al
    //axios.get(url).then((response) => ... )de react.
    fun getDogsByBreeds(@Url url: String):Response<ImgResponse>
}