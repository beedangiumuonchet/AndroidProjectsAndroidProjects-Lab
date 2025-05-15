package com.example.demoviewpagernavigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

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
        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);

        if (getSupportActionBar() == null) return;
        getSupportActionBar().setTitle("Person");

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (getSupportActionBar() == null) return;

                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.person).setChecked(true);
                        getSupportActionBar().setTitle("Person 1");
                        break;

                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
                        getSupportActionBar().setTitle("Home");
                        break;

                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.settings).setChecked(true);
                        getSupportActionBar().setTitle("Settings");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            @SuppressLint("NonConstantResourceId")
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (getSupportActionBar() == null) return false;

                switch (item.getItemId()) {
                    case R.id.person:
                        viewPager.setCurrentItem(0);
                        getSupportActionBar().setTitle("Person 2");
                        break;

                    case R.id.home:
                        viewPager.setCurrentItem(1);
                        getSupportActionBar().setTitle("Home");
                        break;

                    case R.id.settings:
                        viewPager.setCurrentItem(2);
                        getSupportActionBar().setTitle("Settings");
                        break;
                }
                return true;
            }
        });
    }
}