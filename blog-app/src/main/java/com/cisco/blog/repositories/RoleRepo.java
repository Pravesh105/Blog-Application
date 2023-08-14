package com.cisco.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}