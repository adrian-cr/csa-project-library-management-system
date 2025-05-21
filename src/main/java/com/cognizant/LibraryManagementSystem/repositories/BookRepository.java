package com.cognizant.LibraryManagementSystem.repositories;

import com.cognizant.LibraryManagementSystem.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
