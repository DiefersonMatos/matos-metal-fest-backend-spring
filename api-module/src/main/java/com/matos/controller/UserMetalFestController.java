package com.matos.controller;

import com.matos.business.user.boundary.UserService;
import com.matos.business.user.entry.UserEntry;
import com.matos.business.user.response.UserResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing users in the MetalFest system.
 * <p>
 * This controller provides endpoints to retrieve, create, and delete users.
 * All endpoints are prefixed with <code>/user</code>.
 */
@Log4j2
@RestController
@RequestMapping("/user")
public class UserMetalFestController {

    private final UserService userService;

    public UserMetalFestController(UserService userService) {
        this.userService = userService;
    }

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
     * @param userEntry a {@link UserEntry} containing the details of the new user
     * @return a {@link ResponseEntity} containing the created {@link UserResponse}
     */
    @PostMapping("/create-user")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserEntry userEntry) {
        try {
            UserResponse response = userService.createUser(userEntry);
            log.info("created userName: '{}' for email: '{}'", response.getUserName(), response.getEmail());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // TODO: implement logic to handle exception.
            return ResponseEntity.internalServerError().build();
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