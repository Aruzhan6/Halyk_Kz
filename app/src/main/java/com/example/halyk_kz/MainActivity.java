package com.example.halyk_kz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Information> informationList = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        setTeamData();

        adapter = new MyAdapter(informationList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void setTeamData() {
        Information information = new Information("Общая информация");
        informationList.add(information);

        information = new Information("График оплаты по договору");
        informationList.add(information);

        information = new Information("Страховые покрытия");
        informationList.add(information);

        information = new Information("Выкупные суммы при досрочном расторжении");
        informationList.add(information);

        information = new Information("Займы");
        informationList.add(information);

        information = new Information("Дивиденды");
        informationList.add(information);
    }
}