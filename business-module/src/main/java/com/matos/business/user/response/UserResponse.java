package com.matos.business.user.response;

import com.matos.business.user.UserActionResult;
import lombok.Data;

/**
 * Represents the response structure returned after user-related operations.
 * <p>
 * This class contains basic user data along with the result of the user action,
 * and is typically used in API responses or service layer outputs.
 */
@Data
public class UserResponse {

    /**
     * The name of the user.
     */

    private String userName;

    /**
     * The email of the user.
     */
    private String email;

    /**
     * Indicates the result of the user operation, such as creation success or validation failure.
     */
    private UserActionResult userActionResult;

    /**
     * Builds a {@link UserResponse} instance containing only the action result.
     *
     * @param result the action result of the user operation
     * @return a new {@link UserResponse} with the result set
     */
    public static UserResponse build(UserActionResult result) {
        UserResponse response = new UserResponse();
        response.setUserActionResult(result);
        return response;
    }

    /**
     * Builds a {@link UserResponse} instance with user data and the action result.
     *
     * @param name   the username
     * @param email  the user email
     * @param result the action result of the user operation
     * @return a new {@link UserResponse} with all fields populated
     */
    public static UserResponse build(String name, String email, UserActionResult result) {
        UserResponse response = new UserResponse();
        response.setUserName(name);
        response.setEmail(email);
        response.setUserActionResult(result);
        return response;
    }
}
