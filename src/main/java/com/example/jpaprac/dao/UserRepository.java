package com.example.jpaprac.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.jpaprac.entities.User;
import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer>{
    
    List<User> findByName(String name);

    @Query("Select u from User u")
    public List<User> getAllUser();

    @Query("Select u from User u Where u.name = :n AND u.city =:c")
    public List<User> getAllUserByName(@Param("n") String name,@Param("c") String city);

    @Query(value = "select * from user",nativeQuery = true)
    public List<User> getUsers();
}
