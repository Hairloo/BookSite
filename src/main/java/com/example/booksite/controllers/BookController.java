package com.example.booksite.controllers;

import com.example.booksite.dto.BookDTO;
import com.example.booksite.models.Book;
import com.example.booksite.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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


    @GetMapping("/books/new")
    public  String createBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "books-create";
    }

    @PostMapping("/books/new")
    public String saveBook(@ModelAttribute("book") BookDTO bookDTO){
        bookService.saveBook(bookDTO);
        return "redirect:/books";
    }

    @GetMapping("/books/{id}/edit")
    public  String editBookForm(@PathVariable("id") Long bookId, Model model){
        BookDTO book = bookService.findBookById(bookId);
        model.addAttribute("book", book);
        return "books-edit";
    }

    @PostMapping("/books/{id}/edit")
    public String updateBook(@PathVariable("id") Long id, @ModelAttribute("book") BookDTO bookDTO){
        bookService.updateBook(bookDTO);
        return "redirect:/books";
    }
}
