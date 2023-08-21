# Spring Interceptor with Annotations

This is a sample Spring Boot application that demonstrates the usage of Spring Interceptors with annotations.

## Prerequisites

Before running this application, make sure you have the following prerequisites installed:

- Java Development Kit (JDK) 8 or higher
- Maven build tool

## Getting Started

Follow these instructions to run the application on your local machine:

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE.
3. Build the project using Maven to download the necessary dependencies.
4. Run the `SpringBootHelloWorldApplication` class to start the Spring Boot application.
5. Access the API endpoints provided by the `HelloController` class.

## Application Overview

The application consists of the following components:

- `HelloController`: This class defines two RESTful API endpoints, `/hello` and `/helloworld`. The `/helloworld` endpoint is annotated with `@Loggable`, indicating that it should be intercepted by the `LoggerInterceptor` class.

- `LoggerInterceptor`: This class implements the `HandlerInterceptor` interface and is responsible for intercepting requests and logging information before handling the requests. It intercepts methods annotated with `@Loggable` and logs the class and method names.

- `InterceptorConfig`: This configuration class is responsible for registering the `LoggerInterceptor` as an interceptor using Spring's `WebMvcConfigurerAdapter`.

- `Loggable`: This is a custom annotation that can be applied to methods to indicate that they should be intercepted.

## Interceptor Configuration

The `LoggerInterceptor` class implements the `HandlerInterceptor` interface and intercepts requests before they are handled by the `HelloController`. It logs information before request handling, after request handling, and after the completion of the request.

The `@Loggable` annotation is used to mark methods that should be intercepted by the `LoggerInterceptor`.

## Usage

The application exposes the following RESTful API endpoints:

- `GET /hello`: Returns a "Hello!" message. This endpoint is not intercepted.

- `GET /helloworld`: Returns a "Hello World!" message. This endpoint is intercepted by the `LoggerInterceptor` and logs information before the request is handled.

When you access the `/helloworld` endpoint, the `LoggerInterceptor` will log messages to the console, indicating the interception of the method execution.

## Configuration

The application uses Spring's component scanning to automatically detect and configure the components, including the controller, interceptor, and configuration classes.

The project uses Maven as the build tool, and the dependencies are listed in the `pom.xml` file.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.