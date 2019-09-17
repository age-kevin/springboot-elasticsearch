package com.age.springboot.repository;

import com.age.springboot.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * elasticsearch repository 自定义方法参照：
 * https://docs.spring.io/spring-data/elasticsearch/docs/3.1.10.RELEASE/reference/html/#elasticsearch.query-methods
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    public List<Book> findByBookNameLike(String bookName);

}
