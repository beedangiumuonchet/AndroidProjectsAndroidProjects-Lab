package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.e("AAA", "On Activity 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("AAA", "On Create Activity 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("AAA", "On restart Activity 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("AAA", "On resume Activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("AAA", "On pause Activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("AAA", "On stop Activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("AAA", "On destroy Activity 2");
    }

    public void toActivity1(View view) {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }

    public void closeActivity2(View view) {
        finish();
    }
}