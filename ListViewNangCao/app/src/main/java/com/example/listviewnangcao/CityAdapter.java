package com.example.listviewnangcao;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.example.listviewnangcao.databinding.DongThanhPhoBinding;

import java.util.List;

public class CityAdapter extends BaseAdapter {
    private Context context;
    private List<City> cityList;
    public CityAdapter(Context context, List<City> cityList) {
        this.context = context;;
        this.cityList = cityList;
    }
    @Override
    public int getCount() {
        return cityList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        DongThanhPhoBinding binding;

        binding = DongThanhPhoBinding.inflate(LayoutInflater.from(context), viewGroup, false);

        City city = cityList.get(position);
        binding.txtTen.setText(city.getNameCity());
        binding.txtlink.setText(city.getLinkWiki());
        binding.imgHinh.setImageResource(city.getHinh());

        return binding.getRoot();
    }
}
