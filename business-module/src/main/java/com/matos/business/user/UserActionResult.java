package com.matos.business.user;

/**
 * Enum representing the possible outcomes of user-related operations.
 * <p>
 * This enum is typically used to indicate the result of a service method,
 * such as creating or validating a user.
 */
public enum UserActionResult {
    /**
     * Indicates that the user was successfully created.
     */
    USER_CREATED,

    /**
     * Indicates that a user with the same email already exists and cannot be created again.
     */
    USER_NOT_AVAILABLE_TO_CREATE,

    /**
     * Indicates that the provided input data was invalid (e.g., missing fields).
     */
    INVALID_INPUT
}
