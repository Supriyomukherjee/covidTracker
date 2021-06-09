package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class StatewiseDataActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    List<StatewiseModel> statewiseModels ;
    private static  String dataurl = "https://api.covid19india.org/data.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statewise_data);
    }
}