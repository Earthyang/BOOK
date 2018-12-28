package com.yang.dao;

import com.yang.BaseTest;
import com.yang.entity.Book;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.List;

//这里一定要继承BaseTest类，否则无法注入
//IDEA编译器：Bean注入成功，左边显示带箭头的绿色网球图标，方法左侧也是绿色图标
public class BookDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private SqlSessionFactoryBean sqlSessionFactory;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testQueryById() throws Exception{
            long id = 1000;
            System.out.println("dataSource: "+dataSource);
            System.out.println("sqlSessionFactory: "+sqlSessionFactory);
            Book book = bookDao.queryById(id);
            System.out.println(book);

    }

    @Test
    public void testQueryAll() throws Exception {
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        long bookId = 1000;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update=" + update);
    }
}
