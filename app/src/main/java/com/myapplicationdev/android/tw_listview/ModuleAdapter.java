package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> module;
    private Context context;
    private TextView tvModuleName;
    private ImageView ivModuleImage;

    public ModuleAdapter(Context context, int resources, ArrayList<Module> objects) {
        super(context, resources, objects);
        module = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.module_row, parent, false);

        TextView tvModuleName = rowView.findViewById(R.id.tvModule);
        ImageView ivModuleImage = rowView.findViewById(R.id.ivModule);

        Module tempModule = module.get(position);
        tvModuleName.setText(tempModule.getModuleName());

        if (tempModule.getModuleImage()) {
            ivModuleImage.setImageResource(R.drawable.prog);
        } else {
            ivModuleImage.setImageResource(R.drawable.nonprog);
        }


        return rowView;
    }
}