package com.dvctt.yt.controller;

import com.dvctt.yt.controller.utils.R;
import com.dvctt.yt.domain.Book;
import com.dvctt.yt.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author etern
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @PostMapping
    public R save(@RequestBody Book book) {
        Boolean flag = bookService.saveBook(book);
        return new R(flag);
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        Boolean flag = bookService.modify(book);
        return new R(flag);
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        Boolean flag = bookService.delete(id);
        return new R(flag);
    }


    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return new R(true,book);
    }
}
