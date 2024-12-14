# Spring Boot JWT Authentication Project

## Overview
This project demonstrates a complete JWT (JSON Web Token) authentication implementation using Spring Boot, providing a secure authentication and authorization mechanism for RESTful APIs.

## Features
- User registration and login
- JWT token generation and validation
- Role-based access control
- Secure password handling
- Stateless authentication mechanism
- Refreshable access tokens

## Technologies Used
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Spring Data JPA
- H2 Database (or your preferred database)
- Maven/Gradle

## Prerequisites
- Java 17 or higher
- Maven or Gradle
- Postman (optional, for API testing)

## Project Structure
```
src
├── main
│   ├── java
│   │   └── com/yourcompany/jwtauth
│   │       ├── config          # Security configurations
│   │       ├── controller      # REST API endpoints
│   │       ├── model           # Entity classes
│   │       ├── repository      # Database repositories
│   │       ├── security        # JWT and authentication logic
│   │       └── service         # Business logic
│   └── resources
│       └── application.properties
└── test                        # Unit and integration tests
```

## Setup and Installation

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/spring-boot-jwt-auth.git
cd spring-boot-jwt-auth
```

### 2. Configure Application Properties
Modify `src/main/resources/application.properties`:
```properties
# Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

# JWT Configuration
jwt.secret=yourSecretKey
jwt.expiration=86400000  # 24 hours in milliseconds
```

### 3. Build the Project
```bash
# For Maven
mvn clean install

# For Gradle
gradle clean build
```

### 4. Run the Application
```bash
# For Maven
mvn spring-boot:run

# For Gradle
gradle bootRun
```

## API Endpoints

### Authentication
- `POST /api/auth/register` - User registration
- `POST /api/auth/login` - User login (returns JWT token)
- `POST /api/auth/refresh` - Refresh access token

### Example Protected Endpoints
- `GET /api/user/profile` - User profile (requires authentication)
- `GET /api/admin/dashboard` - Admin dashboard (requires admin role)

## Authentication Flow
1. User registers with username and password
2. User logs in and receives JWT token
3. Token is sent in Authorization header for subsequent requests
4. Server validates token for each protected endpoint

## Security Configuration
- Passwords are bcrypt-hashed
- Tokens are signed and validated
- Role-based access control implemented
- CORS and CSRF protection enabled

## Testing
Run tests using:
```bash
# For Maven
mvn test

# For Gradle
gradle test
```

## Postman Collection
Import the Postman collection in `postman/jwt-auth-collection.json` to test APIs.

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
Distributed under the MIT License. See `LICENSE` for more information.

## Contact
Your Name - your.email@example.com

Project Link: [https://github.com/yourusername/spring-boot-jwt-auth](https://github.com/yourusername/spring-boot-jwt-auth)
