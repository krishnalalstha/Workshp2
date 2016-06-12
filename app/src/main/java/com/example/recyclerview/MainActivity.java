package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.adapter.EuroTeamRVAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> teamList = new ArrayList<>();
        teamList.add("England");
        teamList.add("France");
        teamList.add("Scotland");
        teamList.add("Wales");
        teamList.add("Spain");
        teamList.add("Romania");
        teamList.add("Austria");
        teamList.add("Albania");
        teamList.add("Belgium");



        EuroTeamRVAdapter euroTeamRVAdapter = new EuroTeamRVAdapter(teamList);
        recyclerView.setAdapter(euroTeamRVAdapter);
    }


}
