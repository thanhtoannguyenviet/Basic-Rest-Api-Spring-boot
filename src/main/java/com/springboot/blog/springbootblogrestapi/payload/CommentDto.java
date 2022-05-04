package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CommentDto {
    private Long id;
    private String name;
    private String email;
    private String body;
}
