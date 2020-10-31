package com.example.covid_19pwc.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.covid_19pwc.R
import com.example.covid_19pwc.data.model.NewsApiResponse

class CovidDetailsAdapter(
    private val students: List<NewsApiResponse.Article>,
    private val context: FragmentActivity?,
) : RecyclerView.Adapter<CovidDetailsAdapter.MyViewHolder>() {


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val studentAvatar: ImageView = itemView.findViewById(R.id.news_image)
        val source: TextView = itemView.findViewById(R.id.source)
        val author: TextView = itemView.findViewById(R.id.author)
        val description: TextView = itemView.findViewById(R.id.description)

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = students[position]

        holder.source.text = data.source.name
        holder.author.text = data.author
        holder.description.text = data.description

        context?.let {
            Glide.with(it)
                .load(data.urlToImage)
                .placeholder(R.drawable.ic_photo_broken)
                .into(holder.studentAvatar)
        }


    }

    override fun getItemCount() = students.size
}