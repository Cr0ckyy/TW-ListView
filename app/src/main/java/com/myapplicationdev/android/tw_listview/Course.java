package com.myapplicationdev.android.tw_listview;


public class Course {

    private int year;
    private boolean moduleName;

    public Course(int year, boolean moduleName) {
        this.year = year;
        this.moduleName = moduleName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isModuleName() {
        return moduleName;
    }

    public void setModuleName(boolean moduleName) {
        this.moduleName = moduleName;
    }
}
