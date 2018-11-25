package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {
    private final String username;
    private final String email;
}
