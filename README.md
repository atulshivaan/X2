X2
Overview
The Employee Management System is a web application designed to help businesses manage their employee records effectively. It allows administrators to add, view, update, and delete employee details such as name, email, phone number, and department. The system is built using Spring Boot for the backend, Thymeleaf for the front end, and MySQL as the database.

Features
Employee CRUD Operations: Add, edit, delete, and view employee details.
User-friendly Interface: Built using Bootstrap for responsive and intuitive design.

Tech Stack
Frontend: Thymeleaf, Bootstrap 4
Backend: Spring Boot, Spring Data JPA
Database: MySQL
Build Tool: Maven
Java Version: 23

Prerequisites
Before you start, ensure you have the following installed:

JDK 23 or higher
Maven (for building the project)
MySQL (for the database)
Docker (optional, for containerized deployment)

Installation
1. Clone the Repository
Clone this repository to your local machine:

bash
Copy code
git clone https://github.com/yourusername/X2.git
cd X2

Set Up the Database
Make sure you have a MySQL database running. You can create a new database with the following command:

sql
Copy code
CREATE DATABASE ems;
 Configure Database Connection
Open src/main/resources/application.properties and update the database connection details:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

=> Build the Project
Use Maven to build the project:

bash
Copy code
mvn clean install

=> Run the Application
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run

After the application starts, visit http://localhost:8080 in your browser.

Usage

Employee Management

Add an Employee: Navigate to Add Employee from the navbar. Fill in the details and submit.
View Employee List: The employee list is displayed on the main page, where you can see the list of employees and their details.
Edit Employee: Click the Edit button next to an employee to modify their details.
Delete Employee: Click the Delete button to remove an employee.

API Endpoints

GET /employees: Fetch all employees.
POST /employees: Add a new employee.
PUT /employees/{id}: Update an existing employee's details.
DELETE /employees/{id}: Delete an employee by ID.

Running with Docker (Optional)
You can also run the application using Docker. First, build the Docker image:

bash
Copy code
docker build -t employee-management-system .
Then, run the application:

bash
Copy code
docker run -p 8080:8080 employee-management-system
Access the app at http://localhost:8080.





