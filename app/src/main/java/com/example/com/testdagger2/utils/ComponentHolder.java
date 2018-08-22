package com.example.com.testdagger2.utils;

import com.example.com.testdagger2.di.AppComponent;

public class ComponentHolder {
    public static AppComponent myAppComponent;

    public static AppComponent getMyAppComponent() {
        return myAppComponent;
    }

    public static void setMyAppComponent(AppComponent myAppComponent) {
        ComponentHolder.myAppComponent = myAppComponent;
    }
}
