package uz.texnopos.restapi.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import uz.texnopos.restapi.model.Model

interface ApiInterface {

    @GET("blogEntry.comments?")
    fun getClasses(@Query("blogEntryId") id: Int): Call<Model>
}