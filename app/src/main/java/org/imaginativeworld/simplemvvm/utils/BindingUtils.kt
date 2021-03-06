package org.imaginativeworld.simplemvvm.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter


@BindingAdapter("srcUrlProfile")
fun ImageView.setImage(url: String) {
    GlideApp.with(context)
        .load(url)
        .profilePhoto()
        .into(this)
}
