package com.enaa.miniprojet.Service;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Dto.BookDto;
import com.enaa.miniprojet.Mappers.BookMap;
import com.enaa.miniprojet.Model.Author;
import com.enaa.miniprojet.Model.Book;
import com.enaa.miniprojet.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookMap bookMap;
    private final BookRepository bookRepository;


    public BookService(BookMap bookMap, BookRepository bookRepository) {
        this.bookMap = bookMap;
        this.bookRepository = bookRepository;
    }

    public BookDto ajouter(BookDto dto){
        Book book = bookMap.toEntity(dto);
        Book save = bookRepository.save(book);
        return bookMap.toDto(save);
    }

    public List<BookDto> getAll(){
        List<Book> books = bookRepository.findAll();
        return bookMap.toDTOs(books);
    }

    public BookDto getById(Long id){
        Book foundCompetence =bookRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("book not found"));
        return bookMap.toDto(foundCompetence);
    }

    public BookDto update(Long id, BookDto dto){
        Book books = bookRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found"));

        books.setTitle(dto.getTitle());
        books.setIsbn(dto.getIsbn());
        books.setAuthor(dto.getAuthor());
        Book savedBook = bookRepository.save(books);

        return bookMap.toDto(savedBook);
    }
}
