package com.example.deniz.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.myButton);


    }

    public void changeImage(View view) {

        ImageView imageView = findViewById(R.id.myImage);
        imageView.setImageResource(R.drawable.einstein);


    }
}
