package com.example.booksite.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDTO {
    private long id;
    private String bookName;
    private String bookCoverURL;
    private String genre;
    private String publisher;
    private int publicationYear;
    private String isbn;
    private int numberOfPages;
    private int numberOfLikes;
    private int numberOfDislikes;
}