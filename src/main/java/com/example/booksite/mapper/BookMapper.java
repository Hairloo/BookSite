package com.example.booksite.mapper;

import com.example.booksite.dto.BookDTO;
import com.example.booksite.models.Book;

public class BookMapper {
    public static BookDTO mapToBookDTO(Book book){
        BookDTO bookDTO = BookDTO.builder()
                .id(book.getId())
                .bookName(book.getBookName())
                .bookCoverURL(book.getBookCoverURL())
                .genre(book.getGenre())
                .publisher(book.getPublisher())
                .publicationYear(book.getPublicationYear())
                .isbn(book.getIsbn())
                .numberOfDislikes(book.getNumberOfDislikes())
                .numberOfLikes(book.getNumberOfLikes())
                .numberOfPages(book.getNumberOfPages())
                .createdOn(book.getCreatedOn())
                .build();
        return bookDTO;
    }

    public static Book mapToBook(BookDTO bookDTO){
        Book book = Book.builder()
                .bookName(bookDTO.getBookName())
                .bookCoverURL(bookDTO.getBookCoverURL())
                .genre(bookDTO.getGenre())
                .publisher(bookDTO.getPublisher())
                .publicationYear(bookDTO.getPublicationYear())
                .isbn(bookDTO.getIsbn())
                .numberOfPages(bookDTO.getNumberOfPages())
                .createdOn(bookDTO.getCreatedOn())
                .build();
        return book;
    }


    public static Book mapToBookUpdate(BookDTO bookDTO){
        Book book = Book.builder()
                .id(bookDTO.getId())
                .bookName(bookDTO.getBookName())
                .bookCoverURL(bookDTO.getBookCoverURL())
                .genre(bookDTO.getGenre())
                .publisher(bookDTO.getPublisher())
                .publicationYear(bookDTO.getPublicationYear())
                .isbn(bookDTO.getIsbn())
                .numberOfDislikes(bookDTO.getNumberOfDislikes())
                .numberOfLikes(bookDTO.getNumberOfLikes())
                .numberOfPages(bookDTO.getNumberOfPages())
                .createdOn(bookDTO.getCreatedOn())
                .build();
        return book;
    }

    public static Book mapToBookAdd(BookDTO bookDTO){
        Book book = Book.builder()
                .bookName(bookDTO.getBookName())
                .bookCoverURL(bookDTO.getBookCoverURL())
                .genre(bookDTO.getGenre())
                .publisher(bookDTO.getPublisher())
                .publicationYear(bookDTO.getPublicationYear())
                .isbn(bookDTO.getIsbn())
                .numberOfPages(bookDTO.getNumberOfPages())
                .createdOn(bookDTO.getCreatedOn())
                .build();
        return book;
    }
}
