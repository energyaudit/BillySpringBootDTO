package com.stackabuse.dtoexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackabuse.dtoexample.model.User;

@Repository
//For basic CRUD operations, we'll rely on the trusty CrudRepository provided by Spring Boot
public interface UserRepository extends CrudRepository<User, Long>{

}
