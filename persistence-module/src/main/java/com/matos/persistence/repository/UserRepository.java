package com.matos.persistence.repository;

import com.matos.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(final String email);

    boolean existsByEmail(final String email);
}
