package com.sourabh.usermanagementservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sourabh.usermanagementservice.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
