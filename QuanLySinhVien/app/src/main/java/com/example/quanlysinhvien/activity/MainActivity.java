package com.example.quanlysinhvien.activity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quanlysinhvien.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnDanhMucLopHoc).setOnClickListener(this);
        findViewById(R.id.btnQuanLySinhVien).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDanhMucLopHoc:
                Intent intent = new Intent(MainActivity.this, DanhMucLopHocActivity.class);
                startActivity(intent);
                break;
            case R.id.btnQuanLySinhVien:
                Intent intent1 = new Intent(MainActivity.this, QuanLySinhVienActivity.class);
                startActivity(intent1);
                break;
        }
    }

    public class Dbhelper extends SQLiteOpenHelper {
        private static final String DB_Name = "QLSinhvien";
        private static final int DB_Version = 1;
        public Dbhelper(@Nullable Context context) {
            super(context, DB_Name, null, DB_Version);
        }
        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String lophocSQL = "CREATE TABLE lophocs(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    " tenlop text not null)" ;
            String sinhvienSQL = "CREATE TABLE sinhviens(id text primary key, " +
                    " hoten text not null, ngaysinh text, lophocid INTEGER, " +
                    " FOREIGN KEY (lophocid) REFERENCES lophocs(id))";
            sqLiteDatabase.execSQL(lophocSQL);
            sqLiteDatabase.execSQL(sinhvienSQL);
        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            String lophocSQL = "DROP TABLE IF exists lophoc";
            String sinhvienSQL = "DROP TABLE IF EXIsTS sinhviens";
            sqLiteDatabase.execSQL(sinhvienSQL);
            sqLiteDatabase.execSQL(lophocSQL);
            onCreate(sqLiteDatabase);
        }
    }

}