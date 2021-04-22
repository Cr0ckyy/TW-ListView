package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class YearAdapter extends ArrayAdapter<Year> {

    private ArrayList<Year> aa;
    private Context context;
    private TextView textView;

    public YearAdapter(@NonNull Context context, int resource, ArrayList<Year> aa) {
        super(context, resource, aa);
        this.aa = aa;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.year_row, parent, false);

        Year currentYear = aa.get(position);

        textView = rowView.findViewById(R.id.tvYear);
        textView.setText(currentYear.getYear());

        return rowView;
    }
}