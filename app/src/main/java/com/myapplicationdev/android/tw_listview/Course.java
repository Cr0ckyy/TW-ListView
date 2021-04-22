package com.myapplicationdev.android.tw_listview;


public class Course {

    private String year;
    private String moduleCode;
    private int imageId;


    public Course(String year, String moduleCode, int imageId) {
        this.year = year;
        this.moduleCode = moduleCode;
        this.imageId = imageId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
