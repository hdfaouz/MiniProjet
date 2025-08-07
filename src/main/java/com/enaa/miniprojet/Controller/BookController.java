package com.enaa.miniprojet.Controller;

import com.enaa.miniprojet.Dto.BookDto;
import com.enaa.miniprojet.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public BookDto ajouter(@RequestBody BookDto bookDto){
        return bookService.ajouter(bookDto);
    }

    @GetMapping
    public List<BookDto> getAll(){
        return bookService.getAll();
    }
}
