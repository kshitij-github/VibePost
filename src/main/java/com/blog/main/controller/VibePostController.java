package com.blog.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.main.entity.VibePost;
import com.blog.main.service.VibePostService;

@RestController
@RequestMapping("/api/posts")
public class VibePostController {

    @Autowired
    private VibePostService vibePostService;

    @PostMapping
    public ResponseEntity<VibePost> createPost(@RequestBody VibePost post) {
        return ResponseEntity.ok(vibePostService.createPost(post));
    }

    @GetMapping
    public ResponseEntity<List<VibePost>> getAllPosts() {
        return ResponseEntity.ok(vibePostService.getAllPosts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VibePost> getPostById(@PathVariable Long id) {
        return vibePostService.getPostById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

