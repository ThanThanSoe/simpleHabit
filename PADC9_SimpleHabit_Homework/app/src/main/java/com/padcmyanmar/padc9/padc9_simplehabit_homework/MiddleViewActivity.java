package com.padcmyanmar.padc9.padc9_simplehabit_homework;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.padc9_simplehabit_homework.adapters.HVAdapter;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.adapters.RVAdapter;

public class MiddleViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.middle_view);

        RecyclerView recyclerView = findViewById(R.id.rvEvents);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        RVAdapter adapter = new RVAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        RecyclerView recyclerViewTwo = findViewById(R.id.rvEventsTwo);
        LinearLayoutManager linearLayoutManagerTwo= new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        HVAdapter adapterTwo = new HVAdapter();
        recyclerViewTwo.setLayoutManager(linearLayoutManagerTwo);
        recyclerViewTwo.setAdapter(adapterTwo);
    }
}
