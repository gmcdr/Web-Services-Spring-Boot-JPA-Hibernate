package com.zyontec.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zyontec.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
