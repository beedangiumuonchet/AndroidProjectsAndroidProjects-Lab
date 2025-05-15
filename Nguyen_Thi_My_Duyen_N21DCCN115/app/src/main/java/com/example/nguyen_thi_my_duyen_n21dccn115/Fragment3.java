package com.example.nguyen_thi_my_duyen_n21dccn115;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        // Khởi tạo các thành phần
        ImageView userImage = view.findViewById(R.id.userImage);
        TextView username = view.findViewById(R.id.username);
        TextView email = view.findViewById(R.id.email);

        // Thiết lập dữ liệu
        userImage.setImageResource(R.drawable.hb1);
        username.setText("emesekagj");
        email.setText("emesekagj@gmail.com");

        return view;
    }
}