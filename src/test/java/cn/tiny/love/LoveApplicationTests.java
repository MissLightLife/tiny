package cn.tiny.love;

import cn.tiny.aspect.LocalUserManager;
import cn.tiny.service.ProductService;
import cn.tiny.service.sub.SubExceptionService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoveApplicationTests {

    @Autowired
    private ProductService productService;
    @Autowired
    private SubExceptionService subExceptionService;

    @Test(expected = Exception.class)
    public void contextLoads() {
        LocalUserManager.set("Tom");
        productService.delete(25L);

    }

    @Test
    public void testUnpass(){
        LocalUserManager.set("Tom");
        productService.delete(25L);
    }

    @Test
    public void testPass(){
        LocalUserManager.set("admin");
        productService.delete(25L);
    }

    @Test
    public void testAfter(){
        productService.findById(2L);
        subExceptionService.logFor();
    }



}

