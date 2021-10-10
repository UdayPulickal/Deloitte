package com.codetest.todolist.dao;

import com.codetest.todolist.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Userrepo extends CrudRepository<User,Integer> {

}
