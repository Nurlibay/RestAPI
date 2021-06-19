package uz.texnopos.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.texnopos.restapi.databinding.ActivityBlogCommentsBinding
import uz.texnopos.restapi.model.Model
import uz.texnopos.restapi.model.Result
import uz.texnopos.restapi.retrofit.ApiClient

class BlogCommentsActivity : AppCompatActivity(), NetworkListener {

    private lateinit var viewBinding: ActivityBlogCommentsBinding
    private val blogListAdapter: BlogCommentsAdapter = BlogCommentsAdapter()
    private lateinit var networkHelper: NetworkHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityBlogCommentsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.rvResult.adapter = blogListAdapter
        networkHelper = NetworkHelper(ApiClient.getClient())
        setData()
    }

    private fun setData(){
        networkHelper.getClasses(this)
    }

    override fun onSchoolClassesResponse(models: Model) {
        blogListAdapter.models = models
    }

    override fun onSchoolClassesFailure(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}