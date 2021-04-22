package com.myapplicationdev.android.tw_listview;

public class Module {

    private String moduleName;
    private Boolean moduleImage;

    public Module(String moduleName, Boolean moduleImage) {
        this.moduleName = moduleName;
        this.moduleImage = moduleImage;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Boolean getModuleImage() {
        return moduleImage;
    }

    public void setModuleImage(Boolean moduleImage) {
        this.moduleImage = moduleImage;
    }
}