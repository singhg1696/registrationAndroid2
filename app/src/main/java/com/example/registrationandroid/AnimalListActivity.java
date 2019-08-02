package com.example.registrationandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class AnimalListActivity extends AppCompatActivity {

    private ListView listView;
    private RecyclerView recyclerView;
    private String []countryList = {"India", "Canada", "Brazil", "Russia", "China", "USA", "UK", "India", "Canada", "Brazil", "Russia", "China", "USA", "UK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);

        recyclerView = findViewById(R.id.recycler_view);
        //listView = findViewById(R.id.lstAnimals);
        //setCountryList();
        //setTextandImagewithRecyclerView();
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(1,"Dog",R.drawable.dog));
        animalArrayList.add(new Animal(1,"Camel",R.drawable.camel));
        animalArrayList.add(new Animal(1,"Elephant",R.drawable.elephant));
        animalArrayList.add(new Animal(1,"Zebra",R.drawable.zebra));

        AnimalSpinnerAdapter animalSpinnerAdapter = new AnimalSpinnerAdapter(AnimalListActivity.this,animalArrayList);
        animalSpinnerAdapter.notifyDataSetChanged();
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(animalSpinnerAdapter);
//        ActionBar mActionbar =
//       getSupportActionBar();
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
    public void setTextandImagewithRecyclerView()
    {




        /*

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter)
         */


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
