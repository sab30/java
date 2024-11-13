package com.springboot.blog.project.service;

import com.springboot.blog.project.payload.PostDto;

public interface PostService {
    // Return Type is PoStDTO
    PostDto createPost(PostDto postDto);

    // Create a class which will implement this interface
}
