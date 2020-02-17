import com.sl.pojo.Books;
import com.sl.services.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testssm {


    @Test
    public void test1(){
        ApplicationContext con =  new ClassPathXmlApplicationContext("apploctioncontext.xml");
       BookService bs = (BookService) con.getBean("BookServiceImpl");
        for (Books books : bs.queryAllBook()) {
            System.out.println(books);
        }
    }
}
