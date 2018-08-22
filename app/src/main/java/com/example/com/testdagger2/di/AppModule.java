package com.example.com.testdagger2.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.com.testdagger2.app.MyApplication;
import com.example.com.testdagger2.model.http.TaskRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private MyApplication myApplication;

    public AppModule(MyApplication myApplication) {
        this.myApplication = myApplication;
        Log.i("jzy", "AppModule: "+myApplication.getTest());
    }

    @Provides
    @Singleton
    TaskRepository provideTaskRepository(){
        return new TaskRepository();
    }

    @Provides
    @Singleton
    MyApplication getMyApplication(){
        Log.i("jzy", "getMyApplication: "+"who get me");
        return myApplication;
    }

}
