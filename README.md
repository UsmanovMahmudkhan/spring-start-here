## Architecture

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
        I --> P[Chapter 9: Request & Session Scopes]
        
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
        
        P --> P1[Request-Scoped Beans]
        P --> P2[Session-Scoped Beans]
        
        P1 --> P1A[Login Example]
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
│   │   │   │   ├── Bean/                          # Bean classes (Car, Parrot, Comment, etc.)
│   │   │   │   ├── Config/                        # Configuration classes
│   │   │   │   └── Main/                          # Entry points for playground examples (Main, Main2)
│   │   │   ├── Practice/                          # Practice exercises
│   │   │   │   ├── Bean/                          # Exercise bean classes
│   │   │   │   ├── Config/                        # Exercise configurations
│   │   │   │   └── Main/                          # Exercise entry points (Ex1Main, Ex2Main, Ex3Main)
│   │   │   └── SqExrs/                            # Structured exercises (Chapters 3–9 reorganized into named modules)
│   │   │       ├── WiringBeans/                   # Former Chapter 3: bean configuration & dependency injection
│   │   │       │   ├── Bean/                      # Parrot, Person beans
│   │   │       │   ├── Configuration/             # Config classes (Config, Config2, Config3, etc.)
│   │   │       │   └── Main*.java                 # Entry points (Main, Main2, Main4)
│   │   │       ├── UsingAbstractions/             # Former Chapter 4: services, repositories, proxies
│   │   │       │   ├── Model/                     # Comment model and entry-point Main
│   │   │       │   ├── PaymentSystem/             # Payment examples (v1, v2)
│   │   │       │   ├── NotificationBasic/         # Notification examples (v1, v2)
│   │   │       │   ├── Service/                   # Service layer
│   │   │       │   ├── Repository/                # Repository layer
│   │   │       │   ├── Proxy/                     # Proxy pattern examples
│   │   │       │   └── v2/                        # Alternative abstraction-based implementation (email/SMS)
│   │   │       ├── BeanScopes/                    # Former Chapter 5: bean scopes
│   │   │       │   ├── Singleton/                 # Singleton scope examples
│   │   │       │   ├── Protorype/                 # Prototype scope examples
│   │   │       │   ├── Eager_Instantiation/       # Eager loading examples
│   │   │       │   ├── Lazy_Instantiation/        # Lazy loading examples
│   │   │       │   ├── Config*.java               # Scope configuration classes
│   │   │       │   └── Main*.java                 # Scope demonstration entry points
│   │   │       ├── SpringAOC/                     # Former Chapter 6: Aspect-Oriented Programming (AOP)
│   │   │       │   ├── Aspects/                   # AOP examples with @Aspect
│   │   │       │   ├── AnnotationInterceptedMethods/  # AOP with custom annotations
│   │   │       │   ├── InterceptedMethodParameter/    # Modifying method parameters
│   │   │       │   ├── TwoAspectsInOneMethod/         # Multiple aspects ordering
│   │   │       │   └── NO_Aspects/                # Comparison without AOP
│   │   │       ├── SpringBoot/                    # Former Chapters 7 & 8: Spring Boot + Thymeleaf
│   │   │       │   ├── Application.java           # Spring Boot application
│   │   │       │   ├── Controller.java            # MVC controller with templates
│   │   │       │   ├── Comment.java               # Comment model
│   │   │       │   ├── HttpMethod/                # HTTP method examples
│   │   │       │   │   ├── HttpsMethods/          # Product management (GET/POST)
│   │   │       │   │   │   ├── Application.java   # Standalone Spring Boot app
│   │   │       │   │   │   ├── Controller/        # Product controller
│   │   │       │   │   │   ├── Service/           # ProductService
│   │   │       │   │   │   ├── Model/             # Products model
│   │   │       │   │   │   └── Configuration/     # Config class
│   │   │       │   │   └── HttpsMethods2/         # User & Comment management
│   │   │       │   │       ├── Application.java   # Standalone Spring Boot app
│   │   │       │   │       ├── Controller/        # User/Comment controller
│   │   │       │   │       ├── Service/           # UserService
│   │   │       │   │       ├── Model/             # User, Comment models
│   │   │       │   │       └── Configuration/     # Config class
│   │   │       │   ├── PathVariable/              # Path variable examples
│   │   │       │   │   ├── Application.java       # Standalone Spring Boot app
│   │   │       │   │   └── Controller.java        # Path variable controller
│   │   │       │   └── RequestParametr/           # Request parameter examples
│   │   │       │       ├── Application.java       # Standalone Spring Boot app
│   │   │       │       └── Controller.java        # Request parameter controller
│   │   │       ├── SpringMVC/                     # REST-style controller without templates
│   │   │       │   ├── Application.java           # Spring Boot application
│   │   │       │   └── HelloController.java       # REST controller example
│   │   │       └── WebScopes/                     # Former Chapter 9: web request/session scopes
│   │   │           └── RequestScopedBean/         # Request-scoped bean examples
│   │   │               ├── FeedbackForm/          # Feedback form example
│   │   │               │   ├── Configuration/     # Config.java
│   │   │               │   ├── Controller/        # FormController.java
│   │   │               │   ├── Model/             # Form.java
│   │   │               │   └── Service/           # FormService.java
│   │   │               └── Login/                 # Login example
│   │   │                   ├── Main.java          # Entry point
│   │   │                   ├── Config.java        # Configuration class
│   │   │                   ├── Controller.java    # Login controller (GET/POST)
│   │   │                   └── LoginProcessor.java# Request-scoped login bean
│   │   └── resources/
│   │       ├── templates/                          # Thymeleaf templates
│   │       │   ├── home.html                       # Home page template
│   │       │   ├── main.html                       # Main page template
│   │       │   ├── color.html                      # Color example template (PathVariable)
│   │       │   ├── name.html                       # Name example template (RequestParam)
│   │       │   ├── names.html                      # User name template (HttpsMethods2)
│   │       │   ├── allproducts.html                # Products list template (HttpsMethods)
│   │       │   ├── userComment.html                # User & Comment template (HttpsMethods2)
│   │       │   └── login.html                      # Login page template (Chapter 9 RequestScopedBean)
│   │       └── application.properties              # Spring Boot configuration
│   └── test/
│       └── java/spring/springExercise/
│           └── SpringExerciseApplicationTests.java # Basic test class
├── pom.xml                                         # Maven project configuration
├── mvnw                                            # Maven wrapper (Unix)
├── mvnw.cmd                                        # Maven wrapper (Windows)
└── LICENSE                                         # Boost Software License 1.0
```

