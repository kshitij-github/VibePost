package com.blog.main.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.main.entity.VibePost;
import com.blog.main.repository.VibePostRepository;

@Service
public class VibePostService {

    @Autowired
    private VibePostRepository vibePostRepository;

    public VibePost createPost(VibePost post) {
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());
        return vibePostRepository.save(post);
    }

    public List<VibePost> getAllPosts() {
        return vibePostRepository.findAll();
    }

    public Optional<VibePost> getPostById(Long id) {
        return vibePostRepository.findById(id);
    }

   
}

