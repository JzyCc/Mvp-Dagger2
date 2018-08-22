package com.example.com.testdagger2.presenter;

import com.example.com.testdagger2.base.BasePresenter;
import com.example.com.testdagger2.model.http.TaskRepository;
import com.example.com.testdagger2.presenter.contract.MainContract;

import javax.inject.Inject;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{
    private TaskRepository taskRepository;

    @Inject
    public MainPresenter(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public void getPerson() {
        mView.logPerson(taskRepository.getPerson());
    }
}
