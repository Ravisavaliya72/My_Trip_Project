package com.trip.myproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> arrayList = new ArrayList<>();


        arrayList.add(new Item("Thailand", R.drawable.thailand, "Thailand \nThailand \nThailand \nThailand \nThailand"));
        arrayList.add(new Item("Kashmir", R.drawable.kashmir, "Kashmir \nKashmir \nKashmir \nKashmir \nKashmir"));
        arrayList.add(new Item("Himachal", R.drawable.himachal, "Himachal \nHimachal \nHimachal \nHimachal \nHimachal"));
        arrayList.add(new Item("Goa", R.drawable.goa, "Goa \nGoa \nGoa \nGoa \nGoa"));
        arrayList.add(new Item("Kerala", R.drawable.kerela, "Kerala \nKerala \nKerala \nKerala \nKerala"));
        arrayList.add(new Item("Bangalore", R.drawable.bangalore, "Bangalore \nBangalore \nBangalore \nBangalore \nBangalore"));
        arrayList.add(new Item("Maldives", R.drawable.maldives, "Maldives \nMaldives \nMaldives \nMaldives \nMaldives"));
        arrayList.add(new Item("Ladakh", R.drawable.ladakh, "Ladakh \nLadakh \nLadakh \nLadakh \nLadakh"));
        arrayList.add(new Item("Kutch", R.drawable.kutch, "Kutch \nKutch \nKutch \nKutch \nKutch"));
        arrayList.add(new Item("Andaman", R.drawable.andaman, "Aandaman \nAandaman \nAandaman \nAandaman \nAandaman"));
        arrayList.add(new Item("Rajasthan", R.drawable.rajasthan, "Rajasthan \nRajasthan \nRajasthan \nRajasthan \nRajasthan"));
        arrayList.add(new Item("Dubai", R.drawable.dubai, "Dubai \nDubai \nDubai \nDubai \nDubai"));
        arrayList.add(new Item("Bali", R.drawable.bali, "Bali \nBali \nBali \nBali \nBali"));
        arrayList.add(new Item("Europe", R.drawable.europe, "Europe \nEurope \nEurope \nEurope \nEurope"));
        arrayList.add(new Item("Singapore", R.drawable.singapore, "Singapore \nSingapore \nSingapore \nSingapore \nSingapore"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                intent.putExtra("data",item.getAbout());
                startActivity(intent);
            }
        });
    }
}