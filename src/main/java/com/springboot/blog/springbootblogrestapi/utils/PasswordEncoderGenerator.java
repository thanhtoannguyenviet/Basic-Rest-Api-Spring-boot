package com.springboot.blog.springbootblogrestapi.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderGenerator {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
    }
    // 123456 -> $2a$10$oyR3Z3B3OodCyD1dw/NUUuwz0srAPPNo.PMKAFmZmClh9Wyu51hdy
}
