package com.enaa.miniprojet.Repository;

import com.enaa.miniprojet.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
