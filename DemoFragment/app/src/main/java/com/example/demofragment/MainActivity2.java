package com.example.demofragment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demofragment.fragments.FragmentB;

public class MainActivity2 extends AppCompatActivity
    implements FragmentB.Counter
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void incrementValue(int count) {
        FragmentB fragmentB;
        fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment_container_view_2);
        if (fragmentB != null) {
            fragmentB.setCount(count);
        }
    }

//    public void incrementValue(int count) {
//        FragmentB fragmentB;
//        fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment_container_view_2);
//        if (fragmentB != null) {
//            fragmentB.setCount(count);
//        }
//    }
}