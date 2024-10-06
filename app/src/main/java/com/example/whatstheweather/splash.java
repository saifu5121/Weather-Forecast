package com.example.whatstheweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    TextView textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent iHome = new Intent(splash.this, MainActivity.class);
        TextView textViews = findViewById(R.id.textViews);
        textViews.setAlpha(0);
        textViews.animate().alpha(1).setDuration(2000).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 3000);


    }
}