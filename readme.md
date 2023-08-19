# Spring Boot Interceptor Example

This is a simple Spring Boot application that demonstrates the usage of interceptors. Interceptors are used to intercept and process HTTP requests and responses in a Spring MVC application.

## Prerequisites

- Java 8 or higher
- Maven 3.9.3

## Getting Started

1. Clone the repository or download the source code.
1. Navigate to the project directory.

## Building and Running the Application

1. Open a terminal or command prompt.
1. Navigate to the project directory.
1. Run the following command to build the application:

```shell
mvn clean install
```

4. Once the build is successful, run the following command to start the application:

```shell
mvn spring-boot:run
```

5. The Spring Boot application will start, and you can access the following endpoint:

```
http://localhost:8080/hello
```

## Explanation

- The `InterceptorConfig` class is responsible for registering the `LoggerInterceptor` as an interceptor.
- The `LoggerInterceptor` class implements the `HandlerInterceptor` interface and provides the logic to be executed before and after handling the request.
- The `HelloController` class contains a simple REST API endpoint mapped to `/hello`, which logs a message when accessed.

## Technologies Used

- Java
- Spring Boot
- Maven

## License
