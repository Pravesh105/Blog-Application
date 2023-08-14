package com.cisco.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
