package com.cts.usermanagement.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.usermanagement.model.*;



@Repository
//The @Repository annotation is used on java classes
//which directly access the database.
public interface UserDao extends CrudRepository<AppUser, Integer> {

}