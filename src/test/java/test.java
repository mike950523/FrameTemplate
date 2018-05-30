  
  
import javax.annotation.Resource;  
  
import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;
import com.cn.SSM.pojo.User;
import com.cn.SSM.service.UserService;  
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class test {  
    private static Logger logger = Logger.getLogger(test.class);  
    @Resource  
    private UserService userService = null;  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        logger.info(JSON.toJSONString(user));  
    }  
}  
