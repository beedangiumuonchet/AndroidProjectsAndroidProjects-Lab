package com.example.linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Danh sách ID của các TextView trong bố cục
        int[] textViewIDs = {
                R.id.textView1, R.id.textView2, R.id.textView3,
                R.id.textView4, R.id.textView5, R.id.textView6,
                R.id.textView7, R.id.textView8,
        };

        // Gán sự kiện click cho từng TextView
        for (int id : textViewIDs) {
            TextView textView = findViewById(id);
            if (textView != null) {
                textView.setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v instanceof TextView) {
            TextView clickedTextView = (TextView) v;
            String text = clickedTextView.getText().toString();
            Toast.makeText(this, "Bạn đã nhấn vào: " + text, Toast.LENGTH_SHORT).show();
        }
    }
}
