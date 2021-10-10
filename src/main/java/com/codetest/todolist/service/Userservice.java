package com.codetest.todolist.service;

import com.codetest.todolist.model.User;

import java.util.List;
import java.util.Optional;

public interface Userservice {

    public List<User> getalltasks();
    public void deletetask(Integer id);
    public void saveorupdate(User user);
    public Optional<User> getbyid(Integer id);


}

