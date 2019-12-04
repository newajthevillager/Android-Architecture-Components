package com.example.movies.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.movies.R;
import com.example.movies.databinding.ActivityTopicsBinding;
import com.example.movies.utils.ClickHandler;

public class TopicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTopicsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_topics);

        binding.setHandler(new ClickHandler());
    }
}
