package com.dvctt.yt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dvctt.yt.dao.BookDao;
import com.dvctt.yt.domain.Book;
import com.dvctt.yt.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author etern
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book>  implements IBookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean saveBook(Book book) {
        return bookDao.insert(book)>0;
    }

    @Override
    public boolean modify(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

//    @Override
//    public Book getById(Integer id) {
//        return bookDao.selectById(id);
//    }

//    @Override
//    public IPage<Book> getPage(int currentPage, int pageSize) {
//        IPage page = new Page(currentPage,pageSize);
//        bookDao.selectPage(page,null);
//        return page;
//    }
//
//    @Override
//    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
//        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
//        lqw.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
//        lqw.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
//        IPage page = new Page(currentPage,pageSize);
//        bookDao.selectPage(page,lqw);
//        return page;
//    }
}
