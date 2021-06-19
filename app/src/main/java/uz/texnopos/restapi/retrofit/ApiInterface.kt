package uz.texnopos.restapi.retrofit

import retrofit2.Call
import retrofit2.http.GET
import uz.texnopos.restapi.model.Model

interface ApiInterface {

    @GET("/api/blogEntry.comments?blogEntryId=79")
    fun getClasses(): Call<Model>

}