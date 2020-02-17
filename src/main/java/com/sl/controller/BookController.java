package com.sl.controller;

import com.sl.pojo.Books;
import com.sl.services.BookService;
import com.sl.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
public class BookController {
    // controller 掉service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService ;

    //查询所有的数据 并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String bookList(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/addBook")
    public String toAddPaper(){
        return "addBook";
    }
    //添加书籍
    @RequestMapping("/addBooks")
    public String addBook(Books books){
        int num = bookService.addBook(books);
        return "redirect:/allBook";//重定向
    }

    //跳转到修改书籍页面
    @RequestMapping("/updateBook")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBooks")
    public String toUpdatePaper(Books books){
        int num = bookService.updateBook(books);
        return "redirect:/allBook";//重定向
    }
    //删除书籍
    @RequestMapping("/deleteBook")
    public String deltePaper(int id){
         bookService.deleteBookById(id);
        return "redirect:/allBook";//重定向
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
         List<Books> list = bookService.queryBookByName(queryBookName);
         if (list.size()<0){
             model.addAttribute("err","找不到该书籍");
         }
         model.addAttribute("list",list);
        return "allBook";
    }
}
