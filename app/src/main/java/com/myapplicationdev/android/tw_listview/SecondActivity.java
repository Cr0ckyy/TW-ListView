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
    ArrayAdapter aa;
    ArrayList<Course> course;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);


        lv = (ListView) this.findViewById(R.id.lv);

        // Create a few food objects in Food array
        course = new ArrayList<course>();
        course.add(new Course("Year 1", "C111", 1));
        course.add(new Course("Year 1", "C222", 2));
        course.add(new Course("Year 1", "C333", 3));
        course.add(new Course("Year 1", "C444", 4));
        course.add(new Course("Year 1", "C555", 5));
        course.add(new Course("Year 1", "C666", 6));
        course.add(new Course("Year 1", "C777", 7));
        course.add(new Course("Year 1", "C888", 8));
        course.add(new Course("Year 1", "C999", 9));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleAdapter(this, R.layout.module_row, course);
        lv.setAdapter(aa);


    }


}
