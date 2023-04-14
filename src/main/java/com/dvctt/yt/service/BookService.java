package com.dvctt.yt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dvctt.yt.domain.Book;

import java.util.List;

/**
 * @author etern
 */
public interface BookService {
    boolean save(Book book);

    boolean update(Book book);

    boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);
}
