package com.chenp.spring5.entity;

import lombok.*;

/**
 * @author chenpi
 * @create 2022-10-13 22:30
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer bookId;
    private String bookName;
    private String bstatus;

}
