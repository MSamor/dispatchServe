package dispatch.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String string = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
        System.out.println(string);
    }

}
