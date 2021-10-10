package com.codetest.todolist.service;

import com.codetest.todolist.dao.Userrepo;
import com.codetest.todolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class UserserviceImpl {

    @Autowired
    Userrepo userp;

    public List<User> getalltasks() {
        return (List<User>) userp.findAll();
    }

    public void deletetask(Integer id) {
        userp.deleteById(id);
    }

    public void saveorupdate(User user)
    {
        userp.save(user);
    }


    public Optional<User> getbyid(Integer id)
    {
        return userp.findById(id);
    }

    public void saveorupdate(Optional<User> userupd)
    {

    }


}
