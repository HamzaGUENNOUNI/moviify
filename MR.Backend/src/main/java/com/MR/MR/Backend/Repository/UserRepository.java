package com.MR.MR.Backend.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.MR.MR.Backend.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByAddress(String address);
}
