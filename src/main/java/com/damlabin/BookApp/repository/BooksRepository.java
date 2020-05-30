package com.damlabin.BookApp.repository;


import com.damlabin.BookApp.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {

    Books findBooksById(Long bookId);

}
