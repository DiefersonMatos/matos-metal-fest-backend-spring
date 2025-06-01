package com.matos.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Spring Boot application class for MetalFest.
 * <p>
 * This class bootstraps the entire application, enabling component scanning across
 * the "com.matos" package, JPA repository support, and entity scanning.
 * <p>
 * To start the application, run the {@code main} method.
 */
@SpringBootApplication(scanBasePackages = "com.matos")
@EnableJpaRepositories(basePackages = "com.matos.persistence.repository")
@EntityScan(basePackages = "com.matos.persistence.entity")
public class Application {

    /**
     * Application entry point.
     *
     * @param args command-line arguments passed at startup
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}