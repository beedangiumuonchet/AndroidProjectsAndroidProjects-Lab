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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.e("AAA", "On Main Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("AAA", "On Create Main Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("AAA", "On restart Main Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("AAA", "On resume Main Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("AAA", "On pause Main Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("AAA", "On stop Main Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("AAA", "On destroy Main Activity");
    }

    public void toActivity2(View view){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }

    public void closeMainActivity(View view) {
        finish();
    }
}