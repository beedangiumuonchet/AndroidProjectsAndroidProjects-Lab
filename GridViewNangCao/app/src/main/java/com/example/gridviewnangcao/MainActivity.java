package com.example.gridviewnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<HinhAnh> arrayHinhAnh;
    GridView gridView;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gvHinhanh);
        arrayHinhAnh = new ArrayList<>();
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));
        arrayHinhAnh.add(new HinhAnh(R.drawable.bg, "bg1"));

        adapter = new HinhAnhAdapter(this, R.layout.cell_hinh_anh, arrayHinhAnh);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int i, long l) {
                HinhAnh hinhAnh = arrayHinhAnh.get(i);
                Intent intent = new Intent(MainActivity.this,
                        PictureActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("ha",hinhAnh);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
    }
}