package com.demo.LibraryManagement.repository;

//package com.library.repository;

import com.demo.LibraryManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
