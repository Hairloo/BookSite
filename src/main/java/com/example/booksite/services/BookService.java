package com.example.booksite.services;

import com.example.booksite.dto.BookDTO;
import com.example.booksite.models.Book;

import java.util.List;

public interface BookService {

    public List<BookDTO> findAllBooks();
    public void saveBook(BookDTO bookDTO);
    public void updateBook(long id, BookDTO bookDTO);

    public BookDTO findBookById(long bookId);

    void delete(Long id);
}
