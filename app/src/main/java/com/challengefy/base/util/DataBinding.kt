package com.challengefy.base.util

import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imageUrl", "placeHolder", "errorImage")
fun setImageUrl(imageView: ImageView, url: String?, placeHolder: Drawable, errorImage: Drawable) {
    if (url != null) {
        val options = RequestOptions()
                .placeholder(placeHolder)
                .error(errorImage)

        Glide.with(imageView)
                .asDrawable()
                .load(url)
                .apply(options)
                .into(imageView)
    } else {
        imageView.setImageDrawable(null)
    }
}
