package com.example.registrationandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class AnimalSpinnerAdapter extends RecyclerView.Adapter<AnimalSpinnerAdapter.MyViewHolder> {

    private  Context context;
    private ArrayList<Animal>animalArrayList;
    public AnimalSpinnerAdapter(Context context, ArrayList<Animal> animalArrayList) {
        this.context = context;
        this.animalArrayList = animalArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_spinner, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Animal animal = animalArrayList.get(position);
        holder.icon.setImageResource(animal.getImageId());
        holder.names.setText(animal.getAnimalName());
    }

    @Override
    public int getItemCount() {
        return animalArrayList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView names;
        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.imgAnimal );
            names = itemView.findViewById(R.id.textView);
        }
    }
}
