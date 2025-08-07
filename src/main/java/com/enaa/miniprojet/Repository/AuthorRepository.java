package com.enaa.miniprojet.Repository;

import com.enaa.miniprojet.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    //3
    @Query(value = "select * from Author where name LIKE 'A%'" ,nativeQuery=true)
    List<Author> findAuthorsByName();
}
