package com.example.com.testdagger2.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.com.testdagger2.app.MyApplication;
import com.example.com.testdagger2.di.ActivityComponent;
import com.example.com.testdagger2.di.ActivityModule;
import com.example.com.testdagger2.di.AppComponent;
import com.example.com.testdagger2.di.DaggerActivityComponent;

import javax.inject.Inject;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView{

    @Inject
    protected P mPresenter;

    protected MyApplication myApplication;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayout();
        myApplication = (MyApplication)getApplication();
        initInject();
        if(mPresenter != null){
            mPresenter.setView(this);
        }else {
            Toast.makeText(this,"init fault",Toast.LENGTH_SHORT).show();
        }
        intEventAndData();
    }

    protected abstract void getLayout();

    protected abstract void initInject();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //处理activity销毁时逻辑
    }

    protected ActivityComponent getActivityComponent(){
        return DaggerActivityComponent.builder()
                .appComponent(myApplication.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }

    protected abstract void intEventAndData();
}
