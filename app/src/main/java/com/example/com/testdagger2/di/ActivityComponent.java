package com.example.com.testdagger2.di;

import com.example.com.testdagger2.ui.activity.MainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = {
        ActivityModule.class
},dependencies = {
        AppComponent.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
}
