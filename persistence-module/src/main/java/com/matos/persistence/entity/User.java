package com.matos.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Entity representing a user in the MetalFest system.
 * <p>
 * This class maps to the {@code t_user} table in the database and
 * stores user-related information such as name, email, and password.
 */
@Data
@Entity
@Table(name = "t_user")
public class User {

    /**
     * The unique identifier for the user, which is the email address.
     */
    @Id
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * The full name of the user.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * The hashed password of the user.
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * The timestamp (in milliseconds) of the last update to the user record.
     */
    @Column(name = "last_update_time")
    private Long lastUpdateTime;
}
