# Rest-Api-with-Spring-Security-and-Spring-Gateway


Project contains two Microservices 
1. Student : Student can buy book, Can view available books.
2. Teacher : Teacher can   View  and update existing books, Add new books for selling. Also can add and view Students.
3.Rest APIs GET,PUSH implemented to perform following tasks of teacher and student using spring boot,in-memory database MYSQL.
4. Rest Requests Data Stored in Mysql Database using Jpa( java Persistence API).
5.Project contains API gateway which routes to student service and teacher service. API Gateway is created using 
Springs Zuul API Gateway Implementation which provides  routing 
through    "http://localhost/8080/{url}"
6.This Project Is secured using Spring Authentication by Spring Security Login. After a Successsful login it redirect 
to API Gateway  "http://localhost:8080/teacher-api"


Modules(dependencies) used:
1.spring-boot-starter-data-jpa
2.spring-boot-starter-web
3.spring-boot-starter-data-rest
4.spring-boot-starter-security
5.mysql-connector-java
6.spring-cloud-starter-netflix-zuul


Can Access Project StartPoint at :
        "http://localhost:8081/login"
        
Port Mapping

8084  -  Student  - Student-service
8083  -  Teacher   -teacher-service
8080  -  Gateway   - Zuul Gateway 
8081  -   Login    - Spring Security

Admin :
 Username: Vishal
 Password: 1234




