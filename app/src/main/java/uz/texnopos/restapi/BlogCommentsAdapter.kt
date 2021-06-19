package uz.texnopos.restapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.restapi.databinding.BlogCommentsItemBinding
import uz.texnopos.restapi.model.Result

class BlogCommentsAdapter: RecyclerView.Adapter<BlogCommentsAdapter.BlogCommentsViewHolder>() {

    inner class BlogCommentsViewHolder(private val binding: BlogCommentsItemBinding): RecyclerView.ViewHolder(binding.root){
        fun populateModel(model: Result){
                binding.tvId.text = model.id.toString()
                binding.tvCreationTimeSeconds.text = model.creationTimeSeconds.toString()
                binding.tvCommentatorHandle.text = model.commentatorHandle
                binding.tvLocale.text = model.locale
                binding.tvText.text = model.text
                binding.tvParentCommentId.text = model.parentCommentId.toString()
                binding.tvRating.text = model.rating.toString()
        }
    }

    var models: List<Result> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogCommentsViewHolder {
        val binding = BlogCommentsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BlogCommentsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BlogCommentsViewHolder, position: Int) {
        models?.get(position)?.let { holder.populateModel(it) }
    }

    override fun getItemCount(): Int = models?.size?: 0
}