package com.example.nguyen_thi_my_duyen_n21dccn115;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private List<Food> foodList;

    public FoodAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item_layout, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.foodImage.setImageResource(food.getImageResId());
        holder.foodName.setText(food.getName());
        holder.foodCalories.setText("Cal: " + food.getCalories());
        holder.foodCarbs.setText("Carbs: " + food.getCarbs() + "g");
        holder.foodFat.setText("Fat: " + food.getFat() + "g");
        holder.foodProtein.setText("Protein: " + food.getProtein() + "g");
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImage;
        TextView foodName, foodCalories, foodCarbs, foodFat, foodProtein;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodCalories = itemView.findViewById(R.id.foodCalories);
            foodCarbs = itemView.findViewById(R.id.foodCarbs);
            foodFat = itemView.findViewById(R.id.foodFat);
            foodProtein = itemView.findViewById(R.id.foodProtein);
        }
    }
}