package com.example.susunshun.tripnote

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by 01017031 on 2018/05/28.
 */
class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    interface ItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    val itemTextView: TextView = view.findViewById(R.id.planName)
    val itemImageView: ImageView = view.findViewById(R.id.planImage)
}