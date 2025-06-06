package com.matos.business.user.entry;

import lombok.Data;


/**
 * Data Transfer Object (DTO) representing user input required for creating or registering a user.
 * <p>
 * This class is typically used to collect and validate user-provided data before processing it
 * in the service layer.
 */
@Data
public class UserEntry {

    /**
     * The name of the user.
     */
    private String userName;

    /**
     * The password chosen by the user.
     */
    private String userPassword;

    /**
     * The email address of the user.
     */
    private String userEmail;
}
