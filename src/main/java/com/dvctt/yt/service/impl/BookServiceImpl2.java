package com.dvctt.yt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dvctt.yt.dao.BookDao;
import com.dvctt.yt.domain.Book;
import com.dvctt.yt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author etern
 */
@Service
public class BookServiceImpl2 implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        return bookDao.selectPage(page,null);
    }
}
