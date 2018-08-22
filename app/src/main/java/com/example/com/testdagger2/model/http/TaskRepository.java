package com.example.com.testdagger2.model.http;

import android.util.Log;

import com.example.com.testdagger2.model.dto.PersonDto;

public class TaskRepository {

    public TaskRepository() {
        Log.i("jzy", "TaskRepository: "+"TaskRepository created");
    }

    public PersonDto getPerson(){
        return new PersonDto("Jzy",22);
    }
}
