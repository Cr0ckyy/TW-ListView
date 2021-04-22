package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> al;
    ModuleAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ListView lv = this.findViewById(R.id.lvModule);
        TextView tvYear = findViewById(R.id.tvYear);

        Intent intent = getIntent();
        String message = intent.getStringExtra("year");
        tvYear.setText(message);

        al = new ArrayList<Module>();
        al.add(new Module("C208", true));
        al.add(new Module("C200", false));
        al.add(new Module("C346", true));
        aa = new ModuleAdapter(this, R.layout.module_row, al);
        lv.setAdapter(aa);
    }
}