package com.challengefy.feature.estimate.adapter

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View
import com.challengefy.R

class EstimateMarginDecoration(context: Context) : RecyclerView.ItemDecoration() {

    private val viewSize: Int = context.resources.getDimension(R.dimen.estimate_view_width).toInt()

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val pos = parent.getChildAdapterPosition(view)
        val itemCount = state.itemCount
        if (pos == 0) {
            outRect.left = (parent.width / 2) - (viewSize / 2)
        }

        if (pos == itemCount - 1) {
            outRect.right = (parent.width / 2) - (viewSize / 2)
        }
    }
}