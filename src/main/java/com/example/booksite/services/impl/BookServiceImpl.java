package com.example.booksite.services.impl;

import com.example.booksite.dto.BookDTO;
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
        return books.stream().map((this::mapToBookDTO)).collect(Collectors.toList());
    }

    private BookDTO mapToBookDTO(Book book){
        BookDTO bookDTO = BookDTO.builder()
                .bookName(book.getBookName())
                .bookCoverURL(book.getBookCoverURL())
                .genre(book.getGenre())
                .publisher(book.getPublisher())
                .publicationYear(book.getPublicationYear())
                .isbn(book.getIsbn())
                .numberOfDislikes(book.getNumberOfDislikes())
                .numberOfLikes(book.getNumberOfLikes())
                .numberOfPages(book.getNumberOfPages())
                .build();
        return bookDTO;
    }
}
