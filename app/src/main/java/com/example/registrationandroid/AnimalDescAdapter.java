package com.example.registrationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalDescAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Animal> animalArrayList;

    public AnimalDescAdapter(Context context, ArrayList<Animal> animalArrayList) {
        this.context = context;
        this.animalArrayList = animalArrayList;
    }

    @Override
    public int getCount() {
        return animalArrayList.size();
    }

    @Override
    public Animal getItem(int i) {
        return animalArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.animal_desc, null);
        ImageView icon = view.findViewById(R.id.imageView );
        TextView names = view.findViewById(R.id.textView);
        TextView desc = view.findViewById(R.id.txtAnimalDesc);
        TextView link = view.findViewById(R.id.txtShowMore);

        Animal manimal = getItem(i);
        icon.setImageResource(manimal.getImageId());
        names.setText(manimal.getAnimalName());
        desc.setText(manimal.getDecsription());
        link.setClickable(true);
        return view;
    }
}
