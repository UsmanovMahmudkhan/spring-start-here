<div align="center">

# Spring Exercise Repository

<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=30&duration=2000&pause=1000&color=6DB33F&center=true&vCenter=true&width=600&lines=Learning+Spring+Framework;From+Beans+to+AOP;Progressive+Learning+Path" alt="Typing SVG" />

<img src="https://capsule-render.vercel.app/api?type=waving&color=6DB33F&height=100&section=header&text=Spring%20Exercise&fontSize=42&fontColor=fff&animation=twinkling&fontAlignY=30" alt="Spring Banner" />

<img src="https://github-readme-stats.vercel.app/api?username=UsmanovMahmudkhan&show_icons=true&theme=radical&hide_border=true&bg_color=0D1117&title_color=6DB33F&icon_color=6DB33F" alt="GitHub Stats" />

<img src="https://github-profile-trophy.vercel.app/?username=UsmanovMahmudkhan&theme=radical&no-frame=true&no-bg=true&margin-w=4&margin-h=4&column=7" alt="Trophy" />

```
    ╔═══════════════════════════════════════════════════════╗
    ║                                                       ║
    ║     ____                    ____  __           __    ║
    ║    / __/__  ___  ___  ___  / __ \/ /___  _____/ /    ║
    ║   / /_/ _ \/ _ \/ _ \/ -_) / /_/ / / __ \/ ___/ __   ║
    ║  / __/\___/_//_/\___/\__/ / .___/_/\___/\__/\__/    ║
    ║ /_/                       /_/                        ║
    ║                                                       ║
    ║         Learning Spring Framework                    ║
    ║                                                       ║
    ╚═══════════════════════════════════════════════════════╝
```

**A comprehensive Spring Framework learning repository with hands-on exercises covering core concepts from bean configuration to advanced dependency injection patterns.**

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="spring" width="40" height="40"/> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/maven/maven-original.svg" alt="maven" width="40" height="40"/>

```
From Beans to AOP → Progressive Learning Path
```

[![Java](https://img.shields.io/badge/Java-21-orange.svg?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen.svg?style=for-the-badge&logo=spring)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-BSL%201.0-blue.svg?style=for-the-badge)](LICENSE)

[![GitHub stars](https://img.shields.io/github/stars/UsmanovMahmudkhan/spring-start-here.svg?style=social&label=Star)](https://github.com/UsmanovMahmudkhan/spring-start-here)
[![GitHub forks](https://img.shields.io/github/forks/UsmanovMahmudkhan/spring-start-here.svg?style=social&label=Fork)](https://github.com/UsmanovMahmudkhan/spring-start-here)

<img src="https://komarev.com/ghpvc/?username=UsmanovMahmudkhan&label=Profile%20views&color=6DB33F&style=flat-square" alt="Profile Views" />

</div>

---

## Architecture

### System Overview

```mermaid
graph TB
    subgraph "Spring Exercise Repository"
        A[Playground Module] --> B[Basic Bean Configuration]
        A --> C[Component Scanning]
        A --> D[Custom Bean Registration]
        
        E[Practice Module] --> F[Exercise 1: Bean Relationships]
        E --> G[Exercise 2: Dependency Injection]
        E --> H[Exercise 3: Advanced Configuration]
        
        I[SqExrs Module] --> J[Chapter 3: Bean & DI]
        I --> K[Chapter 4: Services & Proxies]
        I --> L[Chapter 5: Bean Scopes]
        I --> M[Chapter 6: AOP]
        I --> N[Chapter 7: Spring Boot Web]
        I --> O[Chapter 8: Thymeleaf]
        
        J --> J1[Bean Configuration]
        J --> J2[Dependency Injection]
        
        K --> K1[Payment System v1/v2]
        K --> K2[Comment Service]
        K --> K3[Notification System]
        
        L --> L1[Singleton Scope]
        L --> L2[Prototype Scope]
        L --> L3[Eager/Lazy Instantiation]
        
        M --> M1[Aspects with @Around]
        M --> M2[Annotation Interception]
        M --> M3[Parameter Modification]
        M --> M4[Multiple Aspects]
        M --> M5[NO_Aspects Comparison]
        
        N --> N1[REST Controllers]
        N --> N2[Spring Boot Application]
        
        O --> O1[Thymeleaf Templates]
        O --> O2[HTTP GET/POST Methods]
        O --> O3[Path Variables]
        O --> O4[Request Parameters]
        
        O2 --> O2A[Product Management]
        O2 --> O2B[User & Comment Management]
        O2 --> O2C[Service Layer]
        O2 --> O2D[Form Handling]
    end
    
    style A fill:#e1f5ff
    style E fill:#fff4e1
    style I fill:#e8f5e9
```

### Runtime Flow (Example: Payment System)

```mermaid
sequenceDiagram
    participant Main
    participant Context as Spring Context
    participant Config as Configuration Class
    participant Service as PaymentService
    participant Payment as CreditCardPayment
    
    Main->>Context: Create AnnotationConfigApplicationContext
    Context->>Config: Load @Configuration class
    Config->>Context: Register @Bean methods
    Context->>Service: Instantiate @Component beans
    Main->>Context: getBean(PaymentService.class)
    Context-->>Main: Return PaymentService instance
    Main->>Payment: Create CreditCardPayment(5000)
    Main->>Service: pay(creditCardPayment)
    Service->>Service: Process payment
    Service-->>Main: Payment completed
```

### Data Model (Example: Comment System)

```mermaid
classDiagram
    class Comment {
        +String text
        +String name
        +getText()
        +setText()
        +getName()
        +setName()
    }
    
    class CommentService {
        -DBCommentSave dbCommentSave
        -CommentNotification notification
        +publish(Comment)
    }
    
    class DBCommentSave {
        +comment_save(Comment)
    }
    
    class CommentNotification {
        +sendNotification(Comment)
    }
    
    CommentService --> Comment
    CommentService --> DBCommentSave
    CommentService --> CommentNotification
```

---

## Repository Structure

```
springExercise/
├── src/
│   ├── main/
│   │   ├── java/spring/springExercise/
│   │   │   ├── SpringExerciseApplication.java    # Main Spring Boot application
│   │   │   ├── Playground/                        # Basic Spring concepts
│   │   │   │   ├── Bean/                          # Bean classes (Car, Parrot, etc.)
│   │   │   │   ├── Config/                        # Configuration classes
│   │   │   │   └── Main/                          # Entry points for playground examples
│   │   │   ├── Practice/                          # Practice exercises
│   │   │   │   ├── Bean/                          # Exercise bean classes
│   │   │   │   ├── Config/                        # Exercise configurations
│   │   │   │   └── Main/                          # Exercise entry points (Ex1Main, Ex2Main, Ex3Main)
│   │   │   └── SqExrs/                            # Structured exercises
│   │   │       ├── Chapter3/                      # Bean configuration & dependency injection
│   │   │       │   ├── Bean/                       # Parrot, Person beans
│   │   │       │   ├── Configuration/              # Config classes (Config, Config2, Config3, etc.)
│   │   │       │   └── Main.java                   # Chapter 3 entry point
│   │   │       ├── Chapter4/                       # Services, repositories, proxies
│   │   │       │   ├── Model/                      # Comment model
│   │   │       │   ├── PaymentSystem/              # Payment examples (v1, v2)
│   │   │       │   ├── NotificationBasic/         # Notification examples (v1, v2)
│   │   │       │   ├── Service/                    # Service layer
│   │   │       │   ├── Repository/                 # Repository layer
│   │   │       │   └── Proxy/                      # Proxy pattern examples
│   │   │       ├── Chapter5/                       # Bean scopes
│   │   │           ├── Singleton/                  # Singleton scope examples
│   │   │           ├── Protorype/                  # Prototype scope examples
│   │   │           ├── Eager_Instantiation/        # Eager loading examples
│   │   │           └── Lazy_Instantiation/         # Lazy loading examples
│   │   │       ├── Chapter6/                       # Aspect-Oriented Programming (AOP)
│   │   │           ├── Aspects/                    # AOP examples with @Aspect
│   │   │           ├── AnnotationInterceptedMethods/  # AOP with custom annotations
│   │   │           ├── InterceptedMethodParameter/     # Modifying method parameters
│   │   │           ├── TwoAspectsInOneMethod/          # Multiple aspects ordering
│   │   │           └── NO_Aspects/                 # Comparison without AOP
│   │   │       ├── Chapter7/                       # Spring Boot Web (REST)
│   │   │           ├── Application.java            # Spring Boot application
│   │   │           └── HelloController.java        # REST controller example
│   │   │       └── Chapter8/                       # Thymeleaf Templates
│   │   │           ├── Application.java            # Spring Boot application
│   │   │           ├── Controller.java             # MVC controller with templates
│   │   │           ├── Comment.java                # Comment model
│   │   │           ├── HttpMethod/                 # HTTP method examples
│   │   │           │   ├── HttpsMethods/            # Product management (GET/POST)
│   │   │           │   │   ├── Application.java    # Standalone Spring Boot app
│   │   │           │   │   ├── Controller/         # Product controller
│   │   │           │   │   ├── Service/            # ProductService
│   │   │           │   │   ├── Model/              # Products model
│   │   │           │   │   └── Configuration/      # Config class
│   │   │           │   └── HttpsMethods2/          # User & Comment management
│   │   │           │       ├── Application.java    # Standalone Spring Boot app
│   │   │           │       ├── Controller/         # User/Comment controller
│   │   │           │       ├── Service/            # UserService
│   │   │           │       ├── Model/              # User, Comment models
│   │   │           │       └── Configuration/      # Config class
│   │   │           ├── PathVariable/               # Path variable examples
│   │   │           │   ├── Application.java        # Standalone Spring Boot app
│   │   │           │   └── Controller.java         # Path variable controller
│   │   │           └── RequestParametr/            # Request parameter examples
│   │   │               ├── Application.java        # Standalone Spring Boot app
│   │   │               └── Controller.java         # Request parameter controller
│   │   └── resources/
│   │       ├── templates/                          # Thymeleaf templates
│   │       │   ├── home.html                       # Home page template
│   │       │   ├── main.html                       # Main page template
│   │       │   ├── color.html                      # Color example template (PathVariable)
│   │       │   ├── name.html                       # Name example template (RequestParam)
│   │       │   ├── names.html                      # User name template (HttpsMethods2)
│   │       │   ├── allproducts.html                # Products list template (HttpsMethods)
│   │       │   └── userComment.html                # User & Comment template (HttpsMethods2)
│   │       └── application.properties              # Spring Boot configuration
│   └── test/
│       └── java/spring/springExercise/
│           └── SpringExerciseApplicationTests.java # Basic test class
├── pom.xml                                         # Maven project configuration
├── mvnw                                            # Maven wrapper (Unix)
├── mvnw.cmd                                        # Maven wrapper (Windows)
└── LICENSE                                         # Boost Software License 1.0
```

### Key Folders Explained

- **Playground/**: Introduction to Spring concepts with simple, isolated examples
- **Practice/**: Hands-on exercises to reinforce learning (Ex1, Ex2, Ex3)
- **SqExrs/Chapter3/**: Bean configuration methods and dependency injection patterns
- **SqExrs/Chapter4/**: Real-world patterns including payment systems, comment services, and notification systems with multiple implementation versions
- **SqExrs/Chapter5/**: Bean scope management (Singleton, Prototype) and instantiation strategies (Eager, Lazy)
- **SqExrs/Chapter6/**: Aspect-Oriented Programming (AOP) with `@Aspect`, `@Around` annotations, annotation-based interception, parameter modification, multiple aspects ordering, and comparison examples
- **SqExrs/Chapter7/**: Spring Boot web applications with REST controllers (`@RestController`, `@GetMapping`)
- **SqExrs/Chapter8/**: Thymeleaf server-side templating with Spring MVC, including:
  - **Main Controller**: Basic Thymeleaf integration with model attributes
  - **HttpMethod/HttpsMethods**: Complete CRUD example with `@GetMapping` and `@PostMapping`, `ProductService`, and product management
  - **HttpMethod/HttpsMethods2**: User and Comment management system with `UserService`, nested model access (`user.comment.text`), and path variable lookup
  - **PathVariable**: Path variable examples with `@PathVariable` annotation
  - **RequestParametr**: Request parameter examples with `@RequestParam` (including optional parameters)

---
