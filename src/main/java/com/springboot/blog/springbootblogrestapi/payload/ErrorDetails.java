package com.springboot.blog.springbootblogrestapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
@Getter
@AllArgsConstructor
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String detail;
}
