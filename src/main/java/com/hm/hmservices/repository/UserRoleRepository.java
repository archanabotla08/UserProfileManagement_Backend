package com.hm.hmservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.hmservices.model.UserRoleData;

public interface UserRoleRepository extends JpaRepository<UserRoleData, Long>  {

}
