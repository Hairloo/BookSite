package com.example.booksite.controllers;

import com.example.booksite.dto.BookDTO;
import com.example.booksite.services.BookService;
import com.example.booksite.services.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String listBooks(Model model){
        List<BookDTO> books = bookService.findAllBooks();
        model.addAttribute("books", books);
        return "books-list";
    }
}
