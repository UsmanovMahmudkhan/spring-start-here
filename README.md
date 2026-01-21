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
        
        I["SqExrs Module"] --> J["WiringBeans (Bean and DI)"]
        I --> K["UsingAbstractions (Services and Proxies)"]
        I --> L["BeanScopes"]
        I --> M["SpringAOC (AOP)"]
        I --> N["SpringBoot (MVC + Thymeleaf)"]
        I --> O["SpringMVC (REST-only)"]
        I --> P["WebScopes (Request & Session Scopes)"]
        I --> Q["RestServices (REST APIs)"]
        
        J --> J1["Bean Configuration"]
        J --> J2["Dependency Injection"]
        
        K --> K1["Payment System v1 and v2"]
        K --> K2["Comment Service"]
        K --> K3["Notification System"]
        K --> K4["Abstraction v2 (Email and SMS)"]
        
        L --> L1["Singleton Scope"]
        L --> L2["Prototype Scope"]
        L --> L3["Eager/Lazy Instantiation"]
        
        M --> M1["Aspects with @Around"]
        M --> M2["Annotation Interception"]
        M --> M3["Parameter Modification"]
        M --> M4["Multiple Aspects"]
        M --> M5["NO_Aspects Comparison"]
        
        N --> N1["Thymeleaf Controllers"]
        N --> N2["HTTP Methods (Products and Users)"]
        N --> N3["PathVariable and RequestParam"]
        N --> N4["Spring Boot Application"]
        
        O --> O1["REST Controllers"]
        O --> O2["Spring Boot Application"]
        
        P --> P_REQ["Request Scoped Beans"]
        P --> P_SES["Session Scoped Beans"]
        
        P_REQ --> P_REQ1["Login"]
        P_REQ --> P_REQ2["Feedback Form"]
        P_REQ --> P_REQ3["Access Code"]
        P_REQ --> P_REQ4["Calculator"]
        
        P_SES --> P_SES1["Session Counter"]
        P_SES --> P_SES2["Username Storage"]

        Q --> Q1["Exceptions (Advice & Handlers)"]
        Q --> Q2["Response Bodies (DTOs & JSON)"]
        Q --> Q3["Status & Headers (Validation)"]
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
│   │   │           ├── RequestScopedBean/         # Request-scoped bean examples
│   │   │           │   ├── AccessCodeValidation/  # Access code validation
│   │   │           │   │   ├── AccessCode.java
│   │   │           │   │   ├── AccessCodeService.java
│   │   │           │   │   ├── App.java
│   │   │           │   │   ├── Config.java
│   │   │           │   │   └── Controller.java
│   │   │           │   ├── Calculator/            # Calculator example
│   │   │           │   │   ├── Application.java
│   │   │           │   │   ├── CalculatorController.java
│   │   │           │   │   ├── CalculatorRequest.java
│   │   │           │   │   ├── CalculatorService.java
│   │   │           │   │   └── Config.java
│   │   │           │   ├── FeedbackForm/          # Feedback form example
│   │   │           │   │   ├── Configuration/     # Config.java
│   │   │           │   │   ├── Controller/        # FormController.java
│   │   │           │   │   ├── Model/             # Form.java
│   │   │           │   │   └── Service/           # FormService.java
│   │   │           │   └── Login/                 # Login example
│   │   │           │       ├── Main.java          # Entry point
│   │   │           │       ├── Config.java        # Configuration class
│   │   │           │       ├── Controller.java    # Login controller (GET/POST)
│   │   │           │       └── LoginProcessor.java# Request-scoped login bean
│   │   │           └── SessionScopedBean/         # Session-scoped bean examples
│   │   │               ├── SessionCounter/        # Session counter example
│   │   │               │   ├── App.java
│   │   │               │   ├── Config.java
│   │   │               │   ├── Controller.java
│   │   │               │   ├── Counter.java
│   │   │               │   └── CounterService.java
│   │   │               └── UsernameStorage/       # Username storage example
│   │   │                   ├── App.java
│   │   │                   ├── Configuration.java
│   │   │                   ├── UserController.java
│   │   │                   ├── Username.java
│   │   │                   └── UserNameService.java
│   │   │       ├── RestServices/                  # REST Services (Exceptions, Response Bodies, Status)
│   │   │       │   ├── Exceptions/                # REST Exception Handling
│   │   │       │   │   ├── App.java
│   │   │       │   │   ├── Config.java
│   │   │       │   │   ├── RestController.java
│   │   │       │   │   ├── RestControllerAdvice.java  # @RestControllerAdvice example
│   │   │       │   │   └── Payment2/              # Payment exception example
│   │   │       │   ├── SendingObjects_AsResponseBody/ # Return values as Response Body
│   │   │       │   │   ├── Client/                # Client example
│   │   │       │   │   ├── Country/               # Country example
│   │   │       │   │   └── DTOasJSON/             # Returning DTOs as JSON
│   │   │       │   │       ├── App.java
│   │   │       │   │       ├── Config/
│   │   │       │   │       ├── DTO/
│   │   │       │   │       └── RestController/
│   │   │       │   └── StatusAndHeaders/          # Status codes and Response Headers
│   │   │       │       ├── CustomStatus/          # Custom HTTP status
│   │   │       │       ├── User/                  # User management
│   │   │       │       └── ValidationOutcome/     # Validation examples
│   │   └── resources/
│   │       ├── templates/                          # Thymeleaf templates
│   │       │   ├── Math.html                       # Calculator template
│   │       │   ├── access.html                     # Access code template
│   │       │   ├── allproducts.html                # Products list template (HttpsMethods)
│   │       │   ├── color.html                      # Color example template (PathVariable)
│   │       │   ├── counter.html                    # Session counter template
│   │       │   ├── form.html                       # Feedback form template
│   │       │   ├── formResult.html                 # Feedback result template
│   │       │   ├── home.html                       # Home page template
│   │       │   ├── login.html                      # Login page template (Chapter 9 RequestScopedBean)
│   │       │   ├── main.html                       # Main page template
│   │       │   ├── name.html                       # Name example template (RequestParam)
│   │       │   ├── names.html                      # User name template (HttpsMethods2)
│   │       │   ├── readName.html
│   │       │   ├── show.html
│   │       │   ├── userComment.html                # User & Comment template (HttpsMethods2)
│   │       │   └── username.html                   # Username storage template
│   │       └── application.properties              # Spring Boot configuration
│   └── test/
│       └── java/spring/springExercise/
│           ├── SpringExerciseApplicationTests.java # Basic test class
│           └── SqExrs/                            # Exercise tests
│               ├── Chapter7/                      # Chapter 7 tests
│               └── SpringMVC/                     # Spring MVC tests
├── pom.xml                                         # Maven project configuration
├── mvnw                                            # Maven wrapper (Unix)
├── mvnw.cmd                                        # Maven wrapper (Windows)
└── LICENSE                                         # Boost Software License 1.0
```

