package com.bagal.api.authtoken;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class AuthBody {
    private String username;
    private String password;
    public static AuthBody getAuthBody() {
        return AuthBody
                .builder()
                .setUsername("admin")
                .setPassword("password123")
                .build();
    }
}
