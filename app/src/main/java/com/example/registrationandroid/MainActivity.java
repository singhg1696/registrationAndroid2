package com.example.registrationandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner,customSpinner;
    private AutoCompleteTextView autoCompleteTextView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        spinner = findViewById(R.id.namesData);
        button = findViewById(R.id.button);
         final String []studentsData = getResources().getStringArray(R.array.StudentsName);

         spinner.setPrompt("Select Students Name");

         registerForContextMenu(button);
        ArrayAdapter<String> mStringArrayAdapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item, studentsData);
        setSpinnerwithTextandImage();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(MainActivity.this, studentsData[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                Toast.makeText(MainActivity.this, "onNothingSelected", Toast.LENGTH_SHORT).show();
            }
        });
        spinner.setAdapter(mStringArrayAdapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(mStringArrayAdapter);
    }

    public void setSpinnerwithTextandImage()
    {
        customSpinner = findViewById(R.id.spinnerTextImage);

        ArrayList<Animal>animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(1,"Dog",R.drawable.dog));
        animalArrayList.add(new Animal(1,"Camel",R.drawable.camel));
        animalArrayList.add(new Animal(1,"Elephant",R.drawable.elephant));
        animalArrayList.add(new Animal(1,"Zebra",R.drawable.zebra));

        AnimalSpinnerAdapter animalSpinnerAdapter = new AnimalSpinnerAdapter(MainActivity.this,animalArrayList);
       customSpinner.setAdapter(animalSpinnerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnu_Add:
                int id = item.getItemId();

                if (id == R.id.mnu_Add) {
                    Intent intent1 = new Intent(this,AnimalListActivity.class);
                    this.startActivity(intent1);
                    return true;
                }                break;
            case R.id.mnu_Delete:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnu_Next:
            {

                   /* .setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            //Creating the instance of PopupMenu
                            PopupMenu popup = new PopupMenu(MainActivity.this, btnShowContextMenu);
                            //Inflating the Popup using xml file
                            popup.getMenuInflater().inflate(R.menu.poupup_menu, popup.getMenu());

                            //registering popup with OnMenuItemClickListener
                            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                public boolean onMenuItemClick(MenuItem item) {
                                    Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                                    return true;
                                }
                            });

                            popup.show();//showing popup menu
                        }
                    });*///closing the setOnClickListener method

            }
                break;
            case R.id.mnu_Update:
                Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    // Context Menu



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        menu.setHeaderTitle("Perform Action");
    }
}
