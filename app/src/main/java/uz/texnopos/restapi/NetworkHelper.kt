package uz.texnopos.restapi

import android.text.Editable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import uz.texnopos.restapi.model.Model
import uz.texnopos.restapi.retrofit.ApiInterface

class NetworkHelper(private val apiClient: Retrofit) {
    fun getClasses(listener: NetworkListener, blogEntryId: Int){
        val call = apiClient.create(ApiInterface::class.java).getClasses(blogEntryId)
        call.enqueue(  object: Callback<Model>{
            override fun onResponse(
                call: Call<Model>,
                response: Response<Model>?
            ) {
                listener.onSchoolClassesResponse(response?.body()!!.result)
            }

            override fun onFailure(call: Call<Model>?, t: Throwable?) {
                listener.onSchoolClassesFailure(t?.localizedMessage)
            }
        })
    }
}
