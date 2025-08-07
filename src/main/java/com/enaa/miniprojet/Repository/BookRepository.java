package com.enaa.miniprojet.Repository;

import com.enaa.miniprojet.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    //2
    @Query(value = "select * from Book where  date between ? and ?" ,nativeQuery=true)
    List<Book> findBookByDat(Long dat1, Long dat2);

    //4
    @Query(value = "select * from Book order by Date desc" ,nativeQuery=true)
    List<Book> findBookByDatDecr();
    //5
    @Query(value = "select count(*) from Book" ,nativeQuery=true)
    Long findTotalBooks();
}
