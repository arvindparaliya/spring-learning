# Spring Framework Learning Journey

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

## Overview

This repository contains a comprehensive collection of Spring Framework projects developed during my journey to master enterprise Java development. Each project demonstrates different aspects of the Spring ecosystem, from core concepts to advanced integrations, showcasing practical implementations and best practices in backend development.

## Purpose

These projects were built to:

- **Master Spring Framework fundamentals** - Understanding dependency injection, AOP, and core Spring concepts
- **Explore the Spring ecosystem** - Hands-on experience with Spring MVC, JDBC, and ORM
- **Demonstrate backend development skills** - Showcase ability to build scalable, maintainable enterprise applications
- **Document learning progress** - Create a portfolio of practical implementations for professional growth

## Table of Contents

### Core Spring Projects
- [**Spring Core**](#spring-core) - Dependency Injection, IoC Container, Bean Management
- [**Spring AOP**](#spring-aop) - Aspect-Oriented Programming implementations

### Data Access Layer
- [**Spring JDBC**](#spring-jdbc) - Database connectivity and JDBC template usage
- [**Spring ORM**](#spring-orm) - Object-Relational Mapping with Spring
- [**Hibernate Integration**](#hibernate-integration) - Spring + Hibernate configurations

### Web Layer
- [**Spring MVC**](#spring-mvc) - Model-View-Controller web applications
- [**Web Applications**](#web-applications) - Complete full-stack implementations

### Additional Components
- [**Configuration Examples**](#configuration) - XML and annotation-based configurations

## Getting Started

### Prerequisites

- **Java 8+** (JDK 17)
- **Apache Maven 3.6+**
- **Apache Tomcat 10.0+** (for web application deployment)
- **MySQL 8.0+** (for database-related projects)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/arvindparaliya/spring-learning.git
   cd spring-learning-journey
   ```

2. **Navigate to a specific project**
   ```bash
   cd spring-core-examples  # or any other project directory
   ```

3. **Install dependencies**
   ```bash
   mvn clean install
   ```

4. **Configure database (for data access projects)**
   ```bash
   # Create MySQL database
   mysql -u root -p
   CREATE DATABASE spring_learning;
   
   # Update application.properties with your database credentials
   ```

5. **Run the application**
   ```bash
   # For web applications (deploy to Tomcat)
   mvn clean package
   # Deploy the generated WAR file to Tomcat webapps directory
   cp target/your-app.war $TOMCAT_HOME/webapps/
   
   # For Spring Boot projects
   mvn spring-boot:run
   
   # For standalone projects
   mvn exec:java -Dexec.mainClass="com.example.MainClass"
   ```
6. **Access the application**
   ```
   # For Tomcat deployed apps
   http://localhost:8080/your-app-name
   
   # For Spring Boot apps
   http://localhost:8080
   ```  

## 🛠️ Tech Stack

| Technology | Purpose | Version |
|------------|---------|---------|
| **Java** | Core programming language | 17+ |
| **Spring Framework** | Enterprise application development | 5.3+ |
| **Spring MVC** | Web layer framework | 5.3+ |
| **Spring JDBC** | Database access | 5.3+ |
 **Apache Tomcat** | Application server for web deployment | 10.0+ |
| **Maven** | Build automation and dependency management | 3.6+ |
| **MySQL** | Relational database | 8.0+ |


## Project Descriptions

### Spring Core
Fundamental Spring Framework concepts including:
- Inversion of Control (IoC) container
- Dependency Injection patterns
- Bean scopes and lifecycle management
- Configuration approaches (XML, Annotations, Java Config)

### Spring MVC
Web application development featuring:
- Form handling and validation
- View resolution and templating
- Exception handling strategies

### Spring JDBC 
Data access layer implementations:
- JDBC Template usage
- Transaction management
- Connection pooling configurations

### Web Applications
Full-featured applications demonstrating:
- Complete MVC architecture
- Database integration
- User authentication basics
- CRUD operations
- Responsive web interfaces

## Contributing

While this is primarily a learning repository, suggestions and improvements are welcome:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/improvement`)
3. Commit your changes (`git commit -am 'Add some improvement'`)
4. Push to the branch (`git push origin feature/improvement`)
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

> *"The best way to learn Spring is by building real applications. This repository represents my hands-on approach to mastering enterprise Java development."*
