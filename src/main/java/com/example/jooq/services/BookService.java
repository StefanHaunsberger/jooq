package com.example.jooq.services;

import java.util.List;

import com.example.jooq.entities.Book;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    DSLContext context;
    public List<Book> getBooks(){
    //    return context
    //             .selectFrom(Tables.BOOK)
    //             .fetchInto(Book.class);
        return null;
    }
    public void insertBook(Book book){
        // context
        //         .insertInto(Tables.BOOK)
        //         .values(book.getTitle())
        //         .execute();
    }
}
