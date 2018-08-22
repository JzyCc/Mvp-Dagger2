package com.example.com.testdagger2.di;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @ActivityScope
    @Provides
    public Context provideContext(){
        return context;
    }

}
