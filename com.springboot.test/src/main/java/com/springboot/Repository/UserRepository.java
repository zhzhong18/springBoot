package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("from User u where u.id=:id")
    User findUserById(@Param("id") int id);

}
