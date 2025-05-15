package com.example.demoandroidnetwork.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoandroidnetwork.R;
import com.example.demoandroidnetwork.models.WeatherForecastModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {
    private Context ctx;
    private int resource;
    private List<WeatherForecastModel> weatherForecastModelList;

    public WeatherAdapter(Context ctx, int resource, List<WeatherForecastModel> weatherForecastModelList) {
        this.ctx = ctx;
        this.resource = resource;
        this.weatherForecastModelList = weatherForecastModelList;
    }

    @Override
    public int getCount() {
        return weatherForecastModelList.size();
    }

    @Override
    public Object getItem(int i) {
        return weatherForecastModelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view =
                    LayoutInflater.from(ctx).inflate(R.layout.layout_wearther_items, null);
        }
        TextView txtTimeForecast = view.findViewById(R.id.txtTimeForecast);
        TextView txtTemperatureForecast = view.findViewById(R.id.txtTemperatureForecast);
        TextView txtWindForecast = view.findViewById(R.id.txtWindForecast);
        ImageView imgForecast = view.findViewById(R.id.imgForecast);
        WeatherForecastModel weatherForecastModel = weatherForecastModelList.get(i);
        txtTimeForecast.setText("" + weatherForecastModel.getTime());
        txtTemperatureForecast.setText(weatherForecastModel.getTemperature() + "°C");
        txtWindForecast.setText(weatherForecastModel.getWindSpeed() + " km");

        Picasso.get().load("https:" + weatherForecastModel.getIcon()).into(imgForecast);
//imgForecast.src(weatherForecastModel.getTemperature());
        return view;
    }
}
