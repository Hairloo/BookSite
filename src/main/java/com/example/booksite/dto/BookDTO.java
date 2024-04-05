package com.example.booksite.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookDTO {
    private Long id;
    @NotEmpty(message="Book name should not be empty")
    private String bookName;
    @NotEmpty(message="Book cover URL should not be empty")
    private String bookCoverURL;
    private String genre;
    private String publisher;
    private Integer publicationYear;
    @NotEmpty(message="ISBN should not be empty")
    private String isbn;
    private Integer numberOfPages;
    private Integer numberOfLikes;
    private Integer numberOfDislikes;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}