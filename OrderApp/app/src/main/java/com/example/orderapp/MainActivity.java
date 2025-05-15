package com.example.orderapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences = getApplication().getSharedPreferences("onBoard", Context.MODE_PRIVATE);
                if(isFirstTime(preferences)){
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean("isFirstTime", false);
                    editor.apply();

                    startActivity(new Intent(MainActivity.this, OnBoardActivity.class));
                }
            }
        }, 1500);
    }

    private boolean isFirstTime(SharedPreferences preferences) {
        return preferences.getBoolean("isFirstTime", true);
    }
}