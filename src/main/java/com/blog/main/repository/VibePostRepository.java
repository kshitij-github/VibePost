package com.blog.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.main.entity.VibePost;

@Repository
public interface VibePostRepository extends JpaRepository<VibePost, Long> {
}
