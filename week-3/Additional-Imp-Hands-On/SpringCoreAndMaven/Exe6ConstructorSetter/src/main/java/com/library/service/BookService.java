// src/main/java/com/library/service/BookService.java
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor called - Service Name: " + serviceName);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[" + serviceName + "] Adding book: " + bookName);
        bookRepository.saveBook(bookName);
    }
}
