# Project: Library Management System
This project features all the necessary components of a Spring Boot REST API
for a library management system using JPA/Hibernate for data persistence
and a MySQL database for data storage and management.

## Main Features
* CRUD operations for book management
* RESTful API endpoints
* JPA/Hibernate integration
* MySQL database support

## Setup
You can run this project by following the steps below:
1. Clone the repository.
2. Configure database settings in `application.properties` if necessary.
3. Run the project's main class (`LibraryManagementSystemApplication`).
4. Access the API at `http://localhost:8080/api/books`.

## Schema Entities

### `Book`
Represents a book in the library system and contains essential
information about each book record. It has the following fields:

* `id`
  * **Description:** Internal book ID.
  * **Type:** `INT`
  * **Constraints:** `PRIMARY KEY`, `AUTO_INCREMENT`
* `title`
  * **Description:** Book title.
  * **Type:** `VARCHAR`
  * **Constraints:** `NOT NULL`
* `author`
  * **Description:** Book author(s).
  * **Type:** `VARCHAR`
  * **Constraints:** `NOT NULL`
* `isbn`
  * **Description:** Book's ISBN code.
  * **Type:** VARCHAR
  * **Constraints:** `NOT NULL`, `UNIQUE`, `CHECK(LENGTH(isbn) = 13)`
* `publishedDate` 
  * **Description:** Entry creation timestamp (automatically generated)
  * **Type:** `TIMESTAMP`
  * **Constraints:** `NOT NULL`

## API Operations
The project performs the following operations:
* **Get all books**
    * _HTTP method:_ `GET`
    * _API endpoint:_ `/api/books`
* **Get book by ID**
    * _HTTP method:_ `GET`
    * _API endpoint:_ `/api/books/{bookId}`
* **Create book**
    * _HTTP method:_ `POST`
    * _API endpoint:_ `/api/books`
    * _JSON body:_ { "title":"...", "author":"...", "isbn":"..."}
* **Update book**
    * _HTTP method:_ `PUT`
    * _API endpoint:_ `/api/books/{bookId}?title=...&author=...`
* **Delete book**
    * _HTTP method:_ `DELETE`
    * _API endpoint:_ `/api/books/{bookId}`