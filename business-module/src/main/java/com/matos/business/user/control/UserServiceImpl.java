package com.matos.business.user.control;

import com.matos.business.user.UserActionResult;
import com.matos.business.user.boundary.UserService;
import com.matos.business.user.entry.UserEntry;
import com.matos.business.user.response.UserResponse;
import com.matos.persistence.entity.User;
import com.matos.persistence.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Default implementation of the {@link UserService} interface.
 * This service provides business logic for user-related operations.
 */
@Service
@Log4j2
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    /**
     * Constructs a new instance with the required dependencies.
     *
     * @param userRepository  the repository used for user persistence operations
     * @param passwordEncoder the password encoder used to securely store user passwords
     */
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Creates a new user based on the provided input.
     *
     * @param userEntry the user input data
     * @return the result of the creation process wrapped in a {@link UserResponse}
     */
    @Override
    public UserResponse createUser(UserEntry userEntry) {
        if (isInvalidUserEntry(userEntry)) {
            log.info("Attempted to create user with invalid input: {}", userEntry);
            return UserResponse.build(UserActionResult.INVALID_INPUT);
        }

        if (userRepository.existsByEmail(userEntry.getUserEmail())) {
            log.info("User already exists with email: {}", userEntry.getUserEmail());
            return UserResponse.build(userEntry.getUserName(), userEntry.getUserEmail(), UserActionResult.USER_NOT_AVAILABLE_TO_CREATE);
        }

        User user = buildAndSaveUser(userEntry);

        return UserResponse.build(user.getName(), user.getEmail(), UserActionResult.USER_CREATED);
    }

    /**
     * Builds a {@link User} entity from the given input and persists it in the database.
     * The password is encrypted before saving.
     *
     * @param userEntry the data provided for user creation
     * @return the saved {@link User} entity
     */
    private User buildAndSaveUser(UserEntry userEntry) {
        User user = new User();
        user.setName(userEntry.getUserName());
        user.setEmail(userEntry.getUserEmail());
        user.setPassword(passwordEncoder.encode(userEntry.getUserPassword()));

        userRepository.save(user);

        log.info("User created successfully: {}", user.getEmail());
        return user;
    }

    /**
     * Validates the input for user creation.
     * Checks for null entries and blank fields.
     *
     * @param entry the input data to validate
     * @return true if the input is invalid, false otherwise
     */
    private boolean isInvalidUserEntry(UserEntry entry) {
        return entry == null ||
                StringUtils.isBlank(entry.getUserName()) ||
                StringUtils.isBlank(entry.getUserEmail()) ||
                StringUtils.isBlank(entry.getUserPassword());
    }
}
