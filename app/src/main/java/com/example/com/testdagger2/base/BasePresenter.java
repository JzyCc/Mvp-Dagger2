package com.example.com.testdagger2.base;

public class BasePresenter<V extends BaseView> {
    protected V mView;

    public void setView(V mView) {
        this.mView = mView;
    }

    public void dropView(){
        this.mView = null;
    }
}
