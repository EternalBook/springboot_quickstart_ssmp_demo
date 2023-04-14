package com.dvctt.yt.service;

import com.dvctt.yt.domain.Book;


/**
 * @author etern
 */
public interface IBookService {
    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    Book getById(Integer id);

//    IPage<Book> getPage(int currentPage, int pageSize);
//
//    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
