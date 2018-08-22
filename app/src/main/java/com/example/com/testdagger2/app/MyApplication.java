package com.example.com.testdagger2.app;

import android.app.Application;

import com.example.com.testdagger2.di.AppComponent;
import com.example.com.testdagger2.di.AppModule;
import com.example.com.testdagger2.di.DaggerAppComponent;
import com.example.com.testdagger2.utils.ComponentHolder;

public class MyApplication extends Application {
    private AppComponent appComponent;
    private String test;
    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        ComponentHolder.setMyAppComponent(appComponent);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public String getTest(){
        return "application here";
    }
}
