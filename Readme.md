
# Spring Boot Microservice and Keycloak Integration

## Keycloak - Authentication and Authorization   
Keycloak (https://www.keycloak.org), open source, Identity and Access Management tool built for modern applications.
Applications needs some sort of user authentication and authorization mechanism to secure protected resources. Keycloak handles all of this automatically. 

This example shows securing protected resources by integrating Keycloak's authentication with a spring-boot app.

##Use case
The application show the lists of food. The lists are categorized according to employee and non-employee (vegetarian).
Means, employees view special food items and accessible using login/password.

## Technology Stack
- MySQL (docker image)
- keycloak (docker image)
- Spring Boot 2.2.5 
- thymeleaf

## Prerequisites
 * MySQL (docker container)
 * keycloak (docker container)


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

