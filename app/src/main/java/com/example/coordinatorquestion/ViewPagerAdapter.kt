package com.example.coordinatorquestion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_view_holder.view.*
import kotlin.collections.ArrayList


class Post()

class PostAdapter(private val posts: ArrayList<Post>) : RecyclerView.Adapter<PostViewHolder>() {

    init { for (i in 0..9) { posts.add(Post()) } }

    override fun getItemViewType(position: Int): Int = 1
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getItemCount() = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_view_holder, parent, false))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.itemView.view_pager.adapter = MediaAdapter(arrayListOf())
    }

}

class PostViewHolder(view: View): RecyclerView.ViewHolder(view)
