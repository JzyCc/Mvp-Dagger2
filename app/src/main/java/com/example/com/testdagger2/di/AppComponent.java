package com.example.com.testdagger2.di;

import android.content.SharedPreferences;

import com.example.com.testdagger2.app.MyApplication;
import com.example.com.testdagger2.model.http.TaskRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class
})
public interface AppComponent {

    MyApplication myApplication();

    TaskRepository provideTaskRepository();
}
