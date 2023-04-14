package com.dvctt.yt.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dvctt.yt.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测速数据123");
        book.setDescription("测速数据123");
        book.setName("测速数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("测速数据abcdefg");
        book.setDescription("测速数据123");
        book.setName("测速数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "spring");
        bookDao.selectList(qw);
    }
    @Test
    void testGetBy2() {
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name!=null, Book::getName,name);
        bookDao.selectList(lqw);
    }
}
