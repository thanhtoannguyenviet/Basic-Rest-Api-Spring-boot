package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private Long id;
    @NotEmpty(message = "Name should not be null or empty ")
    private String name;
    @Email
    @NotEmpty(message = "Name should not be null or empty ")
    private String email;
    @NotEmpty
    @Size(min=10,message = "Comment body must be minimum 10 character")
    private String body;
}
