package uz.texnopos.restapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.texnopos.restapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnGetData.setOnClickListener {
            if(viewBinding.etBlogEntryId.text!!.isNotEmpty() && viewBinding.etBlogEntryId.text.toString() == 79.toString()){
                val intent = Intent(this, BlogCommentsActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter the blog entry id", Toast.LENGTH_SHORT).show()
            }
        }
    }
}