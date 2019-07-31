package com.example.registrationandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalListActivity extends AppCompatActivity {

    private ListView listView;
    private String []countryList = {"India", "Canada", "Brazil", "Russia", "China", "USA", "UK", "India", "Canada", "Brazil", "Russia", "China", "USA", "UK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);
       Animal newAnimal =new Animal(1,"Dog",12,"Animal is Dog","www.google.com");

        listView = findViewById(R.id.lstAnimals);
        //setCountryList();
        setSpinnerwithTextandImage();
//        ActionBar mActionbar = getSupportActionBar();
//        if (mActionbar!=null)
//        {
//            mActionbar.setDisplayHomeAsUpEnabled(true);
//        }
    }
    private void setCountryList()
    {
        ArrayAdapter<String> mStringArrayAdapter = new ArrayAdapter<>(AnimalListActivity.this,
                android.R.layout.simple_spinner_dropdown_item, countryList);
        listView.setAdapter(mStringArrayAdapter);
    }
    public void setSpinnerwithTextandImage()
    {

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(1,"Dog",R.drawable.dog));
        animalArrayList.add(new Animal(1,"Camel",R.drawable.camel));
        animalArrayList.add(new Animal(1,"Elephant",R.drawable.elephant));
        animalArrayList.add(new Animal(1,"Zebra",R.drawable.zebra));

        AnimalSpinnerAdapter animalSpinnerAdapter = new AnimalSpinnerAdapter(AnimalListActivity.this,animalArrayList);

       listView.setAdapter(animalSpinnerAdapter);


    }

    public void setDescDataofAnimals()
    {

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(1,"Dog",R.drawable.dog));

        animalArrayList.add(new Animal(1,"Camel",R.drawable.camel));
        animalArrayList.add(new Animal(1,"Elephant",R.drawable.elephant));
        animalArrayList.add(new Animal(1,"Zebra",R.drawable.zebra));

//        AnimalSpinnerAdapter animalSpinnerAdapter = new AnimalSpinnerAdapter(AnimalListActivity.this,animalArrayList);
//
//        listView.setAdapter(animalSpinnerAdapter);


    }
}
