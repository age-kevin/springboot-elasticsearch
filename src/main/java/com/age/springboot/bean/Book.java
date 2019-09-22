package com.age.springboot.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "age",type = "book")
public class Book {
    private int id;
    private String bookName;
    private String author;
    private String createdDate;
}
