package com.enaa.miniprojet.Controller;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Dto.BookDto;
import com.enaa.miniprojet.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
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

    @GetMapping("/{id}")
    public BookDto getById(@PathVariable Long id){
        return bookService.getById(id);
    }

    @PutMapping("/{id}")
    public BookDto update(@PathVariable Long id, @RequestBody BookDto dto){
        return bookService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delet(id);
    }
}
