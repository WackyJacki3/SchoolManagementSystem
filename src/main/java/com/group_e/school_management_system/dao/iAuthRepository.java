package com.group_e.school_management_system.dao;

import org.springframework.data.repository.CrudRepository;

import com.group_e.school_management_system.entity.User;

public interface iAuthRepository extends CrudRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);

}
