package com.enaa.miniprojet.Repository;

import com.enaa.miniprojet.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
