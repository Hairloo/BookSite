package com.example.booksite.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookDTO {
    private Long id;
    private String bookName;
    private String bookCoverURL;
    private String genre;
    private String publisher;
    private Integer publicationYear;
    private String isbn;
    private Integer numberOfPages;
    private Integer numberOfLikes;
    private Integer numberOfDislikes;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}