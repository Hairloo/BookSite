package com.example.booksite.services;

import com.example.booksite.dto.BookDTO;

import java.util.List;

public interface BookService {

    public List<BookDTO> findAllBooks();
}
