package com.multani.LoginApp.model;
/*
 *author: Preet
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(
            value = "select * from user where username = ?1",
            nativeQuery = true
    )
    User findUserByUsername(String username);

    @Query(
            value = "select * from user where password = ?1",
            nativeQuery = true

    )
    User findUserByPassword(String password);

    @Query(
            value = "select * from user where email = ?1",
            nativeQuery = true

    )
    User findUserByEmail(String email);
}
