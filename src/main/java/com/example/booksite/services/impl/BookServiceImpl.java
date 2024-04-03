package com.example.booksite.services.impl;

import com.example.booksite.dto.BookDTO;
import com.example.booksite.mapper.BookMapper;
import com.example.booksite.models.Book;
import com.example.booksite.repositories.BookRepository;
import com.example.booksite.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public List<BookDTO> findAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map((BookMapper::mapToBookDTO)).collect(Collectors.toList());
    }

    @Override
    public void saveBook(BookDTO bookDTO) {
        Book book = BookMapper.mapToBookAdd(bookDTO);
        bookRepository.save(book);
    }


    @Override
    public BookDTO findBookById(long bookId) {
        return BookMapper.mapToBookDTO(bookRepository.findById(bookId).get());
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
        Book book = BookMapper.mapToBookUpdate(bookDTO);
        bookRepository.save(book);
    }



}
