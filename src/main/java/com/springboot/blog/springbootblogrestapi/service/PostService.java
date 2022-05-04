package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.PostDto;
import com.springboot.blog.springbootblogrestapi.payload.PostResonse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResonse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDer);
    PostDto getPostById(long id);

    void deletePostById(long id);

    PostDto updatePost(PostDto postDto, long id);
}
