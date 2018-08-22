package com.example.com.testdagger2.ui.activity;

import android.annotation.SuppressLint;
import android.util.Log;

import com.example.com.testdagger2.R;
import com.example.com.testdagger2.base.BaseActivity;
import com.example.com.testdagger2.model.dto.PersonDto;
import com.example.com.testdagger2.presenter.MainPresenter;
import com.example.com.testdagger2.presenter.contract.MainContract;

@SuppressLint("Registered")
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View{

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void intEventAndData() {
        mPresenter.getPerson();
    }

    @Override
    public void logPerson(PersonDto personDto) {
        Log.i("jzy", "logPerson: "+personDto.getName()+","+personDto.getAge());
    }
}