package com.example.movies.adapters;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class ImageBindingAdapter {

    @BindingAdapter({"imageUrl", "placeHolder"})
    public static void setImage(ImageView imageView, String url, Drawable drawable) {
        Glide.with(imageView.getContext())
                .load(url)
                .placeholder(drawable)
                .fitCenter()
                .into(imageView);
    }

}
