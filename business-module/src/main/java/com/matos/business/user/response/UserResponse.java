package com.matos.business.user.response;

import com.matos.business.user.UserActionResult;
import lombok.Data;

@Data
public class UserResponse {
    private String userName;
    private String email;
    private UserActionResult userActionResult;

    public static UserResponse build(UserActionResult result) {
        UserResponse response = new UserResponse();
        response.setUserActionResult(result);
        return response;
    }

    public static UserResponse build(String name, String email, UserActionResult result) {
        UserResponse response = new UserResponse();
        response.setUserName(name);
        response.setEmail(email);
        response.setUserActionResult(result);
        return response;
    }
}
