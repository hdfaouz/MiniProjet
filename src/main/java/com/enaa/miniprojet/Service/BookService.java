package com.enaa.miniprojet.Service;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Dto.BookDto;
import com.enaa.miniprojet.Mappers.BookMap;
import com.enaa.miniprojet.Model.Author;
import com.enaa.miniprojet.Model.Book;
import com.enaa.miniprojet.Repository.BookRepository;
import org.springframework.stereotype.Service;

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
}
