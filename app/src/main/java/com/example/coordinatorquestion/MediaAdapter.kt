package com.example.coordinatorquestion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_view_holder.view.*
import kotlin.collections.ArrayList

class Media()

class MediaAdapter(private val media: ArrayList<Media>) : RecyclerView.Adapter<MediaViewHolder>() {

    init { for (i in 0..9) { media.add(Media()) }
    }

    override fun getItemViewType(position: Int): Int = 1
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getItemCount() = media.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
        return MediaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.media_view_holder, parent, false))
    }

    override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
        holder.itemView.view_pager
    }

}

class MediaViewHolder(view: View): RecyclerView.ViewHolder(view)
