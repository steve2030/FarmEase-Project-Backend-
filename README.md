# FarmEase-BackEnd

Farm Ease is a web application designed to help farmers manage their equipment inventory. This project allows farmers to add, update, and view equipment items, check their availability, and keep track of their ownership. Farm Ease is built using Spring Boot and provides a user-friendly interface for farmers to manage their equipment effortlessly.

## Features

- **Add Equipment:** Farmers can add new equipment items, providing details such as name, description, price, image, and availability status.
- **Update Equipment:** Farmers can edit existing equipment details, including name, description, price, and availability.
- **View Equipment:** Farmers can view a list of all equipment items, along with their details and availability status.
- **Track Ownership:** Each equipment item is associated with a specific owner (a farmer), allowing farmers to track their equipment ownership.

## Technologies Used

- **Spring Boot:** The project is built using the Spring Boot framework, providing a robust and scalable backend for the application.
- **Java Persistence API (JPA):** JPA is used for database interaction, allowing seamless integration with the underlying database.
- **PostgreSql:** An in-memory H2 database is used for storing equipment and farmer data during development.
- **Postman:** For API testing.


## Getting Started

1. **Prerequisites:**
   - Java Development Kit (JDK)
   - Maven Build Tool
   - Git Version Control System

2. **Clone the Repository:**
   ```bash
   git clone https://github.com/steve2030/FarmEase-BackEnd
   cd FarmEase-BackEnd
## API Endpoints

### Farmers

- **GET /api/farmers:** Retrieve a list of all farmers.
- **GET /api/farmers/{id}:** Retrieve details of a specific farmer by ID.
- **POST /api/farmers:** Create a new farmer.
  - Request Body Example:
    ```json
    {
      "firstName": "John",
      "lastName": "Doe",
      "age": 35,
      "address": "123 Main St, Farmtown",
      "phoneNumber": "555-1234"
    }
    ```
- **PUT /api/farmers/{id}:** Update details of an existing farmer by ID.
  - Request Body Example:
    ```json
    {
      "firstName": "Updated",
      "lastName": "Doe",
      "age": 36,
      "address": "123 Main St, Farmtown",
      "phoneNumber": "555-5678"
    }
    ```

### Equipment

- **GET /api/equipment:** Retrieve a list of all equipment items.
- **GET /api/equipment/{id}:** Retrieve details of a specific equipment item by ID.
- **POST /api/equipment:** Create a new equipment item.
  - Request Body Example:
    ```json
    {
      "name": "Tractor",
      "description": "Farm tractor for plowing fields",
      "price": 50000.00,
      "availability": true,
      "owner": {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe"
      }
    }
    ```
- **PUT /api/equipment/{id}:** Update details of an existing equipment item by ID.
  - Request Body Example:
    ```json
    {
      "name": "Updated Tractor",
      "description": "Farm tractor for plowing fields and planting crops",
      "price": 55000.00,
      "availability": false,
      "owner": {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe"
      }
    }
    ```
## license
