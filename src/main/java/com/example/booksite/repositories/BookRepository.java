package com.example.booksite.repositories;

import com.example.booksite.dto.BookDTO;
import com.example.booksite.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByBookName(String bookName);
    Optional<Book> findById(long id);
}
