package com.matos.business.user.boundary;

import com.matos.business.user.entry.UserEntry;
import com.matos.business.user.response.UserResponse;

/**
 * Service interface defining user management operations.
 * <p>
 * This boundary defines the contract for creating users and potentially other user-related
 * business operations in the future.
 */
public interface UserService {

    /**
     * Creates a new user based on the provided user entry data.
     *
     * @param userEntry the data required to create a new user
     * @return the response containing details of the created user
     */
    UserResponse createUser(UserEntry userEntry);
}
