package com.example.layout_app;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
public class FrameLayout extends AppCompatActivity{
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.btn1);
    }
}
