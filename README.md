# Spring Boot Category-Product CRUD 

## 📌 Project Overview
This project is a Spring Boot REST API designed to efficiently manage categories and products. It implements a one-to-many relationship between categories and products, allowing seamless CRUD operations with server-side pagination for optimized data retrieval.

## 🚀 Features
- RESTful API built with Spring Boot
- CRUD operations for Category & Product Management
- JPA & Hibernate for database handling
- One-to-many relationship (A Category can have multiple Products)
- Server-side pagination for scalable performance
- Annotation-based configuration (No XML required)

## 🛠️ Tech Stack
- Framework: Spring Boot
- ORM: Hibernate (JPA)
- Database: MySQL (or any relational database)
- Build Tool: Maven
- Testing & API Interaction: Postman

## Category CRUD Operations

| No. | Endpoint | Description |
|----|---------|-------------|
| 1  | `/api/categories?page=3` | Get all categories with pagination |
| 2  | `/api/categories` | POST - Create a new category |
| 3  | `/api/categories/{id}` | GET - Get category by ID |
| 4  | `/api/categories/{id}` |PUT -  Update category by ID |
| 5  | `/api/categories/{id}` | DELETE - Delete category by ID |

## Product CRUD Operations

| No. | Endpoint | Description |
|----|---------|-------------|
| 1  | `/api/products?page=2` | Get all products with pagination |
| 2  | `/api/products` | POST - Create a new product |
| 3  | `/api/products/{id}` |GET - Get product by ID |
| 4  | `/api/products/{id}` | PUT - Update product by ID |
| 5  | `/api/products/{id}` | DELETE - Delete product by ID |

