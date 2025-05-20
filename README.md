# Matos Metal Fest - Backend

This is the backend service for the **Matos Metal Fest** project. The backend is developed using the **Spring Boot** framework and follows the **Controller-Service-Repository (CSR)** architecture pattern. The project is structured as a multi-module Maven application for better organization and modularity.

## 🧱 Architecture

The architecture used in the project follows the **Controller-Service-Repository (CSR)** pattern, which organizes the application into three layers:

### Architecture Layers

| Layer       | Responsibility                                                             |
|-------------|----------------------------------------------------------------------------|
| **Controller** | Exposes the REST API, handles HTTP requests, and delegates to the appropriate services. |
| **Service**    | Contains business logic, applies business rules, and coordinates data interaction with repositories. |
| **Repository** | Responsible for database communication and access to entities. |

### Architecture Pattern

- **Controller**: Exposed through **RestControllers** with HTTP route mappings.
- **Service**: Layer responsible for business logic, validation, and orchestration of data between layers.
- **Repository**: Implemented with **JPA (Java Persistence API)** for interaction with the database, using **Spring Data JPA**.

---

## 📦 Project Structure

This repository is structured as a multi-module Maven project, where each module has specific responsibilities.

- **`application-module`**: Contains the Spring Boot application entry point, configuring the application's startup.
- **`api-module`**: Contains the REST controllers of the application, exposing interaction points with clients.
- **`business-module`**: Business logic layer (not used in this example but can be extended).
- **`persistence-module`**: Contains JPA entities and repository interfaces for database access (not used in this example).
- **`kafka-module`**: For future Kafka integration (not used in this example but can be extended).

---

## 🚀 Technologies and Tools

- **Java 17**: The version of Java used.
- **Spring Boot**: Framework used for backend development.
- **Maven**: Dependency management and build tool.
- **PostgreSQL**: The database used for data persistence.
- **Docker**: Used to spin up containers for PostgreSQL and pgAdmin.
- **JPA (Java Persistence API)**: For interacting with the database via repositories.
- **Spring Data JPA**: Simplifies integration between the repository layer and the database.

---

## 🛠️ How to Run the Project

### 1. **Prerequisites**

- **Java 17** or above installed.
- **Maven 3.8+**.
- **Docker** (for running PostgreSQL and pgAdmin via Docker Compose).

### 2. **Docker Setup**

This project uses **Docker Compose** to set up the PostgreSQL database and pgAdmin. To start the services, run the following command:

```bash
docker-compose up -d
```

## Docker Setup

This will bring up the following containers:

- **PostgreSQL** (on `localhost:5432`).
- **pgAdmin** (on `localhost:5050`).

---

## 3. Database Configuration

The connection to the PostgreSQL database can be configured in the `application.yml` or `application.properties` file inside the **`application-module`**:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/matosmetalfestdb
    username: matos_admin
    password: matos_pass
    driver-class-name: org.postgresql.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    database-platform: org.hibernate.dialect.PostgreSQLDialect
```

## 4. Running the Project

To compile and run the project, execute the following commands:

### Compile the project:

```bash
mvn clean install
```

## Run the Spring Boot application:

```bash
cd application-module
mvn spring-boot:run
```

## Using the API

### 1. GET /hello/{id}

This route accepts an `id` as a URL parameter and returns a "Hello World" message with the `id` value:

- **URL**: `GET /hello/{id}`
- **Example**: `GET http://localhost:8080/hello/123`
- **Response**: `"Hello World 123"`

---

## Folder Structure

The project's folder structure is as follows:

```plaintext
matos-metal-fest-backend
├── application-module/           # Main module that runs the Spring Boot application
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── matos/
│   │   │   │           └── application/
│   │   │   │               ├── Application.java  # Entry point
│   │   │   │               └── config/
│   │   │   │                   └── application.yml  # Spring configuration
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml                  # Dependencies and build configuration
│
├── api-module/                  # Module containing the REST controllers
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── matos/
│   │                   └── api/
│   │                       └── controller/
│   │                           └── HelloController.java
│   └── pom.xml                  # API-related dependencies
│
├── business-module/             # (Example not used in this project)
├── persistence-module/          # (Example not used in this project)
├── kafka-module/                # (Example not used in this project)
├── docker-compose.yml           # Docker configuration for PostgreSQL and pgAdmin
└── README.md                    # This file
```

## Contributing

If you would like to contribute to this project:

1. Fork the repository.
2. Create a branch for your changes (`git checkout -b feature/xyz`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature XYZ'`).
5. Push to the remote repository (`git push origin feature/xyz`).
6. Open a **Pull Request**.
