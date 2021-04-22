package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

    public class ModuleAdapter extends ArrayAdapter<Course>{

        private ArrayList<Course> course;
        private Context context;
        private TextView tvCourse;
        private ImageView ivIcon;

        public ModuleAdapter(Context context, int resource, ArrayList<Course> objects){
            super(context, resource, objects);
            // Store the food that is passed to this adapter
            course = objects;
            // Store Context object as we would need to use it later
            this.context = context;
        }

        // getView() is the method ListView will call to get the
        //  View object every time ListView needs a row
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // The usual way to get the LayoutInflater object to
            //  "inflate" the XML file into a View object
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // "Inflate" the row.xml as the layout for the View object
            View rowView = inflater.inflate(R.layout.module_row, parent, false);

            // Get the TextView object
            tvCourse = (TextView) rowView.findViewById(R.id.tvModule);
            // Get the ImageView object
            ivIcon = (ImageView) rowView.findViewById(R.id.imageView);


            // The parameter "position" is the index of the
            //  row ListView is requesting.
            //  We get back the food at the same index.
            Course currentCourse = course.get(position);
            // Set the TextView to show the food

            tvCourse.setText(currentCourse.getModuleCode());
            // Set the image to star or nostar accordingly
            if (currentCourse.getImageId() == 1) {
                ivIcon.setImageResource(R.drawable.img1);
            }
            else if (currentCourse.getImageId() == 2) {
                ivIcon.setImageResource(R.drawable.img2);
            }
            else if (currentCourse.getImageId() == 3) {
                ivIcon.setImageResource(R.drawable.img3);
            }
            else if (currentCourse.getImageId() == 4) {
                ivIcon.setImageResource(R.drawable.img4);
            }
            else if (currentCourse.getImageId() == 5) {
                ivIcon.setImageResource(R.drawable.img5);
            }
            else if (currentCourse.getImageId() == 6) {
                ivIcon.setImageResource(R.drawable.img6);
            }
            else if (currentCourse.getImageId() == 7) {
                ivIcon.setImageResource(R.drawable.img7);
            }
            else if (currentCourse.getImageId() == 8) {
                ivIcon.setImageResource(R.drawable.img8);
            }
            else {
                ivIcon.setImageResource(R.drawable.img9);
            }
            // Return the nicely done up View to the ListView
            return rowView;
        }




    }
