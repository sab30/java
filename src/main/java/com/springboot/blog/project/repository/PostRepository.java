package com.springboot.blog.project.repository;

import com.springboot.blog.project.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
