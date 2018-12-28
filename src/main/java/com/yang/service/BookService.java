package com.yang.service;

import com.yang.dto.AppointExecution;
import com.yang.entity.Book;
import com.yang.exception.AppointException;

import java.util.List;

public interface BookService {
    /**
     * 查询一本图书
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     * @param bookId
     * @param studengTd
     * @return
     */
    AppointExecution appoint(long bookId , long studengTd);
}
