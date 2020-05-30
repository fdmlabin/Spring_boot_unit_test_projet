package com.damlabin.BookApp.repository;


import com.damlabin.BookApp.domain.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {

}
