package com.matos.persistence.repository;

import com.matos.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing {@link User} entities.
 * <p>
 * Provides CRUD operations and custom database queries
 * using Spring Data JPA.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    /**
     * Retrieves a user by their email address.
     *
     * @param email the email of the user
     * @return the {@link User} entity if found, or {@code null} otherwise
     */

    User findByEmail(final String email);

    /**
     * Checks if a user exists with the given email address.
     *
     * @param email the email to check
     * @return {@code true} if a user exists with the given email, {@code false} otherwise
     */
    boolean existsByEmail(final String email);
}
