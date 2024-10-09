package com.assignment2.book_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment2.book_services.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
