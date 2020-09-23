package com.example.customadaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lstData;
    String data[] = {"XYZ","ABC","JKL","PQR"};
    ArrayAdapter<String> adapter;
    ArrayList<Item> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstData = findViewById(R.id.lstData);
        list = generateData();
        MyAdapter adapter = new MyAdapter(this,list);
        lstData.setAdapter(adapter);
    }

    private ArrayList<Item> generateData(){
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(data[0],"First item on the list",R.drawable.ic_one));
        items.add(new Item(data[1],"Second item on the list",R.drawable.ic_two));
        items.add(new Item(data[2],"Third item on the list",R.drawable.ic_three));
        items.add(new Item(data[3],"Forth item on the list",R.drawable.ic_four));
        return items;
    }
}