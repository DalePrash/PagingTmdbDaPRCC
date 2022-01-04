package com.example.pagingtmdbdapr.customview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pagingtmdbdapr.R;

class ParentImageViewText extends AppCompatActivity {
    com.example.pagingtmdbdapr.customview.ImageViewText imgtext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_custom_image_text);
        imgtext = findViewById(R.id.customparent);
        //imgtext.getText()
    }
}
