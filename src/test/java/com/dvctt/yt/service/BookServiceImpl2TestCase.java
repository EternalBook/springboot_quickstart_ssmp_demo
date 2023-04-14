package com.dvctt.yt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dvctt.yt.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceImpl2TestCase {
    @Autowired
    private BookService Bookservice;

    @Test
    void testGetById() {
        System.out.println(Bookservice.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测速数据123");
        book.setDescription("测速数据123");
        book.setName("测速数据123");
        Bookservice.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(14);
        book.setType("测速数据abcdefg");
        book.setDescription("测速数据123");
        book.setName("测速数据123");
        Bookservice.update(book);
    }

    @Test
    void testDelete() {
        Bookservice.delete(13);
    }

    @Test
    void testGetAll() {
        Bookservice.getAll();
    }

    @Test
    void testGetPage() {
        IPage<Book> page = Bookservice.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
