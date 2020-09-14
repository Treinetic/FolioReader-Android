package com.folioreader.ui.adapter

import android.view.View
import androidx.annotation.Keep
import androidx.recyclerview.widget.RecyclerView

@Keep
open class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var listViewType: ListViewType = ListViewType.UNKNOWN_VIEW
    var itemPosition: Int = -1

    open fun onBind(position: Int) {}
}