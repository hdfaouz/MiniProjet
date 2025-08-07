package com.enaa.miniprojet.Mappers;
import com.enaa.miniprojet.Dto.BookDto;
import com.enaa.miniprojet.Model.Book;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMap {
    Book toEntity (BookDto dto);
    BookDto toDto (Book book);
    List<BookDto> toDTOs (List<Book> books);

}
