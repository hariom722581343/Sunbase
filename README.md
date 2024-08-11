# Sunbase

# Overview #

# Simple Customer Management CRUD application.
--> Backend: Spring Boot (Java).
--> Database: MySQL.
--> Frontend: HTML/CSS/JavaScript.
--> Authentication: Handled via JWT tokens.

# Features

# Customer Management:
--> Create, Update, Delete, and View customer records.
--> Pagination, sorting, and searching in the customer list.

# Authentication:
--> JWT-based authentication for secure access to the APIs.

# Sync Feature:
--> Sync customer data with a remote API, updating existing records or inserting new ones as needed.

# API Endpoints
Authentication:
--> POST /api/login: Authenticates the user and returns a JWT token.

# Customer API:
--> POST /api/customers: Create a new customer.
--> PUT /api/customers/{id}: Update an existing customer.
--> GET /api/customers: List customers with pagination, sorting, and searching.
--> GET /api/customers/{id}: Get a customer by ID.
--> DELETE /api/customers/{id}: Delete a customer.

# Sync API:
--> POST /api/customers/sync: Sync customer data with the remote API.

# Technologies Used
--> Backend: Spring Boot, Java, JWT
--> Database: MySQL
--> Frontend: HTML, CSS, JavaScript
--> Build Tool: Maven

# Setup and Installation
Prerequisites
--> Java 8 or higher
--> Maven
--> MySQL

                  # Steps to Run #

--># Clone the Repository:

--> git clone [https://github.com/hariom722581343/sunbase](https://github.com/hariom722581343/Sunbase).git
--> cd customer-crud-app
--> Configure the Database:

--> Update the database configuration in src/main/resources/application.properties:
--> spring.datasource.url=jdbc:mysql://localhost:3306/your_database
--> spring.datasource.username=your_username
--> spring.datasource.password=your_password
--> spring.jpa.hibernate.ddl-auto=update
--> security.jwt.token.secret-key=your_secret_key
--> Build the Project:

--> mvn clean install
--> Run the Application:

--> mvn spring-boot:run
--> Access the Application:

--> Frontend: Visit http://localhost:8080/ in your browser.
--> API: Use tools like Postman to interact with the APIs.
