package com.example.books.Controllers;

import java.util.Vector;

import com.example.books.Models.Book;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins="*")
@RestController
public class BookController {
  private static final String path = "/api/v1/books";

  @GetMapping(path)
  public Vector<Book> getBooks() {
    //Book book = new Book("id", "title", "author");
    Vector<Book> rv = new Vector<>();

    rv.add(new Book("1", "test title1", "test author1"));
    rv.add(new Book("2", "test title2", "test author2"));
    return rv;
  }
  @GetMapping(path + "/{id}")
  public Book getBook(@PathVariable String id) {
    Book book = new Book("id", "title", "author");
    System.out.println(id);

    return book;
  }

  @PostMapping(path)
  public Book newBook(@RequestBody String body) {
    Book book = new Book("id", "title", "author");
    System.out.println(body);
    return book;
  }

  @PutMapping(path + "/{id}")
  public Book updateBook(@PathVariable String id, @RequestBody String body) {
    Book book = new Book("id", "title", "author");
    System.out.println(id);
    System.out.println(body);

    return book;
  }

  @DeleteMapping(path + "/{id}")
  public Book deleteBook(@PathVariable String id, @RequestBody String body) {
    Book book = new Book("id", "title", "author");
    return book;
  }
}
