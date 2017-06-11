package api

import model.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by gohv on 10.03.17.
 */
interface PhotoApi {
    @GET("?key=4781168-24b1189761861120a3864b67e&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}