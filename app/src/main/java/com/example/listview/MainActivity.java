package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        final ArrayList<String> colors= new ArrayList<>();
        colors.add(0,"Красный");
        colors.add(1,"Оранжевый");
        colors.add(2,"Желтый");
        colors.add(3,"Зеленый");
        colors.add(4,"Голубой");
        colors.add(5,"Синий");
        colors.add(6,"Фиолетовый");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,colors);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Номер "+ position+ " - "+colors.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
