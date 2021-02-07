package com.hm.hmservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.hmservices.model.UserData;

public interface UserRepository extends JpaRepository<UserData, Long> {

}
