package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer>{
		List<UserEntity> findAll();

		@Query(value = "select * from users where active = :active",nativeQuery = true)
		List<UserEntity> getAllUsersByActiveStatus(Boolean active);
		UserEntity findByEmail(String email);
}

