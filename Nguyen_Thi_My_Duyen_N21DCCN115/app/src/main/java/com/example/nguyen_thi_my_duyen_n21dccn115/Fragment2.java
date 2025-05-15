package com.example.nguyen_thi_my_duyen_n21dccn115;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<Food> foodList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewFood);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2)); // 2 cột

        foodList = new ArrayList<>();
        foodList.add(new Food("Celery Smashers with Cream Gravy", 471, 12, 19, 8, R.drawable.hb1));
        foodList.add(new Food("Browned Butter with Brussels Sprouts", 112, 10, 8, 4, R.drawable.hb1));
        foodList.add(new Food("Baked Fennel Parmesan", 130, 12, 5, 8, R.drawable.hb1));
        foodList.add(new Food("Coconut Milk with Sautéed Kale", 117, 10, 4, 8, R.drawable.hb1));

        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
