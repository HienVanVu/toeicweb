package com.learningtoeic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learningtoeic.entities.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer>{
	@Query(value = "SELECT * FROM users u WHERE u.user_name = ?1 and u.password = ?2", nativeQuery = true)
	UsersEntity findByUserNamePassword(String userName, String password);
}
