package com.aayush.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity4 extends AppCompatActivity {

    ListView listView;

    String[] skills = {"Java", "C++", "Python", "C", "Kotlin", "Basic", "Kotlin", "Android Studio", "SQL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(MainActivity4.this, android.R.layout.simple_dropdown_item_1line, skills);
        listView.setAdapter(adapt);

    }
}