package com.age.springboot;

import com.age.springboot.bean.Book;
import com.age.springboot.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void testBookRepository(){
//        Book book = new Book();
//        book.setId(1);
//        book.setBookName("西游记");
//        book.setAuthor("吴承恩");
//        bookRepository.index(book);

        for (Book book:bookRepository.findByBookNameLike("游")){
            System.out.println(book);
        }
    }

    @Test
    public void contextLoads() {
    }

}
