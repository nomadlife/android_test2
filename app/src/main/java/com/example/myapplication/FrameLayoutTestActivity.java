package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameLayoutTestActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_test);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
    }

    protected void btn_changeImage(View view){
        changeImage();
    }

    protected void changeImage(){
        if (imageIndex == 0) {
            imageView.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 1;
        } else if (imageIndex == 1) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.GONE);
            imageIndex = 0;
        }
    }
}
