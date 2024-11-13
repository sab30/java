package com.springboot.blog.project.service.impl;

import com.springboot.blog.project.entity.Post;
import com.springboot.blog.project.payload.PostDto;
import com.springboot.blog.project.repository.PostRepository;
import com.springboot.blog.project.service.PostService;
import org.springframework.stereotype.Service;

// Mentioning this in then we can @autowire this class so that Java can internally look it up
@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        //Convert DTO to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post newPost = postRepository.save(post);


        // once saved we need to return the JSON by Convert Post Entity into Post DTO as Response

        PostDto postResponse = new PostDto();
        postResponse.setId(newPost.getId());
        postResponse.setTitle(newPost.getTitle());
        postResponse.setDescription(newPost.getDescription());
        postResponse.setContent(newPost.getContent());

        return postResponse;
    }
}
