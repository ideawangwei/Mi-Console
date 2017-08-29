package org.ahstu.mi.console;

import org.ahstu.mi.console.dao.UserDao;
import org.ahstu.mi.console.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiConsoleApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSaveUser() throws Exception {
        UserEntity user = new UserEntity();
        user.setId(null);
        user.setUserName("小明2");
        user.setPassWord("ddd");
        userDao.saveUser(user);
    }

}
