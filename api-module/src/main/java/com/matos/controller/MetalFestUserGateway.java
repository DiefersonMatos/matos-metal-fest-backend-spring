package com.matos.controller;

import com.matos.dto.UserRequest;
import com.matos.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MetalFestUserGateway {

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable String id) {
        // Implementation
        return ResponseEntity.ok(new UserResponse());
    }

    @GetMapping("/all-users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        // Implementation
        return ResponseEntity.ok(List.of(new UserResponse()));
    }

    @GetMapping("/number-of-users")
    public ResponseEntity<Long> getNumberOfUsers() {
        // Implementation
        return ResponseEntity.ok(42L);
    }

    @PostMapping("/create-user")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest user) {
        // Implementation
        return ResponseEntity.ok(new UserResponse());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        // Implementation
        return ResponseEntity.noContent().build();
    }
}