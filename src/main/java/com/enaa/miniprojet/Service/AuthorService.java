package com.enaa.miniprojet.Service;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Mappers.AuthorMap;
import com.enaa.miniprojet.Model.Author;
import com.enaa.miniprojet.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorMap authorMap;
    private final AuthorRepository authorRepository;


    public AuthorService(AuthorMap authorMap, AuthorRepository authorRepository) {
        this.authorMap = authorMap;
        this.authorRepository = authorRepository;
    }

    public AuthorDto ajouter(AuthorDto dto){
        Author author = authorMap.toEntity(dto);
        Author save = authorRepository.save(author);
        return authorMap.toDto(save);
    }

    public List<AuthorDto> getAll(){
        List<Author> authors = authorRepository.findAll();
        return authorMap.toDTOs(authors);
    }

    public AuthorDto getById(Long id){
        Author foundCompetence =authorRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("author not found"));
        return authorMap.toDto(foundCompetence);
    }
}
