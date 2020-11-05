package cn.lnfvc.controller;

import cn.lnfvc.mapper.BookMapper;
import cn.lnfvc.pojo.Book;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {

    @Resource
    private BookMapper bookMapper;

    @GetMapping(value = "/books/{id}")
    public Book test(@PathVariable("id")Integer id){
        return bookMapper.findById(id);
    }

    @GetMapping(value = "/books")
    public List<Book> findAllBooks(){
        return bookMapper.findAllBooks();
    }


    @PostMapping(value = "/books")
    public Book insert(@RequestBody Book book){
       bookMapper.insert(book);
       return book;
    }

    @DeleteMapping(value = "/books/{id}")
    public Book delete(@PathVariable("id")Integer id){
        bookMapper.delete(id);
        return new Book();
    }

    @PutMapping(value = "/books/{id}")
    public Book update(@RequestBody Book book,@PathVariable("id")Integer id){
        book.setId(id);
        bookMapper.update(book);
        return book;
    }






}
