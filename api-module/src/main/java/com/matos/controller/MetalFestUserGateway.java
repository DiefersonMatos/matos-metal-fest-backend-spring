package com.matos.controller;

import com.matos.dto.UserRequest;
import com.matos.dto.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing users in the MetalFest system.
 * <p>
 * This controller provides endpoints to retrieve, create, and delete users.
 * All endpoints are prefixed with <code>/user</code>.
 */
@Slf4j
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
        try {
            // TODO: implement logic to get user by id in service layer.
            UserResponse user = new UserResponse(); // replace with real user data
            log.info("Getting user with id: {}", id);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            log.error("Error getting user with id: {}", id, e);
            return ResponseEntity.noContent().build();
        }
    }

    /**
     * Retrieves a list of all users.
     *
     * @return a {@link ResponseEntity} containing a list of {@link UserResponse} objects
     */
    @GetMapping("/all-users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        try {
            // TODO: implement logic to get all users in service layer.
            List<UserResponse> users = List.of(new UserResponse()); // replace with real user list
            log.info("Getting all users, total: {}", users.size());
            return ResponseEntity.ok(users);
        } catch (Exception e) {
            log.error("Error getting all users", e);
            return ResponseEntity.noContent().build();
        }
    }

    /**
     * Retrieves the total number of registered users.
     *
     * @return a {@link ResponseEntity} containing the number of users as a {@link Long}
     */

    @GetMapping("/number-of-users")
    public ResponseEntity<Long> getNumberOfUsers() {
        try {
            // TODO: implement logic to get number of users in service layer.
            Long numberOfUsers = 42L; // replace with real count
            log.info("Number of registered users: {}", numberOfUsers);
            return ResponseEntity.ok(numberOfUsers);
        } catch (Exception e) {
            log.error("Error getting number of users", e);
            return ResponseEntity.noContent().build();
        }
    }

    /**
     * Creates a new user in the system.
     *
     * @param user a {@link UserRequest} containing the details of the new user
     * @return a {@link ResponseEntity} containing the created {@link UserResponse}
     */
    @PostMapping("/create-user")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest user) {
        try {
            // TODO: implement logic to create user in service layer.
            log.info("Creating user with data: {}", user);
            UserResponse createdUser = new UserResponse(); // replace with created user data
            return ResponseEntity.ok(createdUser);
        } catch (Exception e) {
            log.error("Error creating user", e);
            return ResponseEntity.noContent().build();
        }
    }

    /**
     * Deletes a user by their unique identifier.
     *
     * @param id the ID of the user to delete
     * @return a {@link ResponseEntity} with HTTP 204 No Content status if deletion is successful
     */

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        try {
            // TODO: implement logic to delete user by id in service layer.
            log.info("Deleting user with id: {}", id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            log.error("Error deleting user with id: {}", id, e);
            return ResponseEntity.noContent().build();
        }
    }

}