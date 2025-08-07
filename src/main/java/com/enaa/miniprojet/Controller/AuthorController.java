package com.enaa.miniprojet.Controller;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public AuthorDto ajouter(@RequestBody AuthorDto dto){
        return authorService.ajouter(dto);
    }

    @GetMapping
    public List<AuthorDto> getAll(){
        return authorService.getAll();
    }

    @GetMapping("/{id}")
    public AuthorDto getById(@PathVariable Long id){
        return authorService.getById(id);
    }
}


