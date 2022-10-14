package com.chenp.spring5;

import com.chenp.spring5.entity.Book;
import com.chenp.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class TestBook {
    private ApplicationContext xmlContext = new ClassPathXmlApplicationContext("bean1.xml");
    private ApplicationContext annoContext = new AnnotationConfigApplicationContext("com.chenp.spring5.config");

    @Test
    public void testJdbcTemplate() {
        // ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = xmlContext.getBean("bookService", BookService.class);
        bookService.addBook(new Book(1, "Spring5", "0"));
    }

    @Test
    public void testJdbcTemplate2() {
        // ApplicationContext context = new AnnotationConfigApplicationContext("com.chenp.spring5.config");
        BookService bookService = annoContext.getBean("bookService", BookService.class);
        bookService.addBook(new Book(2, "SpringMVS", "0"));
    }

    @Test
    public void testUpdate() {
        BookService bookService = xmlContext.getBean("bookService", BookService.class);
        bookService.updateBook(new Book(1, "Spring5", "1"));
    }

    @Test
    public void testDelete() {
        BookService bookService = xmlContext.getBean("bookService", BookService.class);
        bookService.deleteBook(2);
    }

    @Test
    public void testQueryCount() {
        BookService bookService = xmlContext.getBean("bookService", BookService.class);
        System.out.println(bookService.queryCount());
    }

    @Test
    public void testQueryBookByID() {
        BookService bookService = xmlContext.getBean("bookService", BookService.class);
        System.out.println(bookService.queryBookByID(1));
    }

    @Test
    public void testQueryBookList() {
        BookService bookService = xmlContext.getBean("bookService", BookService.class);
        List<Book> books = bookService.queryBookList();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
