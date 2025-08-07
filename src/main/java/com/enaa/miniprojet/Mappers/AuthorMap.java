package com.enaa.miniprojet.Mappers;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Model.Author;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface AuthorMap {

    Author toEntity (AuthorDto dto);
    AuthorDto toDto (Author author);
    List<AuthorDto> toDTOs (List<Author> authors);
}
