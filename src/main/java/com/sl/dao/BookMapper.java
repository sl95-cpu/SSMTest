package com.sl.dao;

import com.sl.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookid") int id);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookid") int id);
    //查询全部的书
    List<Books> queryAllBook();
    //根据名字 查询书籍
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
