package com.cisco.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
