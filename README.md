# Employee Management System (Spring Boot, Spring Security, Thymeleaf, MySQL)

This project is a web application built with Spring Boot that demonstrates user authentication and employee CRUD operations. It has two main modules: Employee Management and Registration & Login. While the project includes role-based tables (`users`, `roles`, `users_roles`), by default all authenticated users can manage employees. The structure allows extension to add true Admin vs User restrictions if required.

## 1. Employee Management Module
1. View all employees stored in the database  
2. Add a new employee through a form (first name, last name, email)  
3. Update employee details by editing an existing record  
4. Delete employee records from the database  
5. Display dynamic pages using Thymeleaf templates  
6. Database table: `employees` (id, first_name, last_name, email)  

## 2. Registration and Login Module
1. Register new users with it's details stored in the `users` table  
2. Assign roles to each user i.e. default role (ROLE_USER), which are stored in the `roles` table
3. Store user-role relationships in a join table `users_roles`  
4. Encrypt user passwords with BCrypt before saving  
5. Allow users to log in and validate against `users`  
6. Restrict access to the application for unauthenticated users  
7. Currently, any authenticated user can perform CRUD operations on employees  
8. The system design supports extending role-based access control (e.g., Admin with full CRUD vs User with read-only)  

## 3. Technical Stack
1. Spring Boot for project setup and dependency management  
2. Spring Data JPA with Hibernate for database interactions  
3. Thymeleaf for rendering dynamic HTML templates  
4. Spring Security for authentication and password encryption  
5. MySQL database for persisting users, roles, and employees  
6. Jakarta Bean Validation for input validation  

## 4. User Flow
1. A user registers, and details are saved into the `users` and `roles` tables  
2. The user logs in with credentials checked by Spring Security  
3. On success, the user is redirected to the employee dashboard  
4. The user can view, add, update, or delete employees (no role-based restrictions yet)  
5. On logout, the user is redirected to the login page  

## 5. Use Cases
1. Authenticated User: Can register, log in, and manage employees with full CRUD operations  
2. Future Extension: Role-based separation where Admin has full rights and regular users have limited permissions
