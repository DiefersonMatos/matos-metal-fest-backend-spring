package com.matos.controller;

import com.matos.dto.UserRequest;
import com.matos.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing users in the MetalFest system.
 * <p>
 * This controller provides endpoints to retrieve, create, and delete users.
 * All endpoints are prefixed with <code>/user</code>.
 */
@RestController
@RequestMapping("/user")
public class MetalFestUserGateway {

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the ID of the user to retrieve
     * @return a {@link ResponseEntity} containing the user data
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable String id) {
        // Implementation
        return ResponseEntity.ok(new UserResponse());
    }

    /**
     * Retrieves a list of all users.
     *
     * @return a {@link ResponseEntity} containing a list of {@link UserResponse} objects
     */
    @GetMapping("/all-users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        // Implementation
        return ResponseEntity.ok(List.of(new UserResponse()));
    }

    /**
     * Retrieves the total number of registered users.
     *
     * @return a {@link ResponseEntity} containing the number of users as a {@link Long}
     */

    @GetMapping("/number-of-users")
    public ResponseEntity<Long> getNumberOfUsers() {
        // Implementation
        return ResponseEntity.ok(42L);
    }

    /**
     * Creates a new user in the system.
     *
     * @param user a {@link UserRequest} containing the details of the new user
     * @return a {@link ResponseEntity} containing the created {@link UserResponse}
     */
    @PostMapping("/create-user")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest user) {
        // Implementation
        return ResponseEntity.ok(new UserResponse());
    }

    /**
     * Deletes a user by their unique identifier.
     *
     * @param id the ID of the user to delete
     * @return a {@link ResponseEntity} with HTTP 204 No Content status if deletion is successful
     */

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        // Implementation
        return ResponseEntity.noContent().build();
    }
}