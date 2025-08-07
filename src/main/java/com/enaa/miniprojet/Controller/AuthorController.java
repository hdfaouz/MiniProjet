package com.enaa.miniprojet.Controller;

import com.enaa.miniprojet.Dto.AuthorDto;
import com.enaa.miniprojet.Service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public AuthorDto ajouter(@RequestBody AuthorDto dto){
        return authorService.ajouter(dto);
    }

}
