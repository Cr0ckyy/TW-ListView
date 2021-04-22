package com.myapplicationdev.android.tw_listview;


public class Course {

    private int year;
    private boolean moduleCode;
    private int imageId;

    public Course(int year, boolean moduleCode, int imageId) {
        this.year = year;
        this.moduleCode = moduleCode;
        this.imageId = imageId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(boolean moduleCode) {
        this.moduleCode = moduleCode;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
