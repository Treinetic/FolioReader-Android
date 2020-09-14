package com.folioreader.ui.adapter

import androidx.annotation.Keep
import androidx.recyclerview.widget.RecyclerView

@Keep
interface OnItemClickListener {
    fun onItemClick(
        adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>,
        viewHolder: RecyclerView.ViewHolder, position: Int, id: Long
    )
}