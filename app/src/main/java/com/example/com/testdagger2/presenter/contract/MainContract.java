package com.example.com.testdagger2.presenter.contract;

import com.example.com.testdagger2.base.BasePresenter;
import com.example.com.testdagger2.base.BaseView;
import com.example.com.testdagger2.model.dto.PersonDto;

public interface MainContract {
    interface View extends BaseView {
        void logPerson(PersonDto personDto);
    }

    interface Presenter{
        void getPerson();
    }
}