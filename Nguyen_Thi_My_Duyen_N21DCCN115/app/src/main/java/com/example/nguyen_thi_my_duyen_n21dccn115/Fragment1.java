package com.example.nguyen_thi_my_duyen_n21dccn115;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo danh sách dữ liệu mẫu với mô tả
        itemList = new ArrayList<>();
        itemList.add(new Item("ITEM 1", "Information of Item 1", 6, R.drawable.hb1));
        itemList.add(new Item("ITEM 2", "Information of Item 2", 6, R.drawable.hb1));
        itemList.add(new Item("ITEM 3", "Information of Item 3", 6, R.drawable.hb1));
        itemList.add(new Item("ITEM 4", "Information of Item 4", 6, R.drawable.hb1));
        itemList.add(new Item("ITEM 5", "Information of Item 5", 6, R.drawable.hb1));

        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}