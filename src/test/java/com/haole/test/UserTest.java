package com.haole.test;

import com.haole.domain.User;
import com.haole.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 用户的业务层测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public void testFindByOne(){
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        User user = userService.findById(1);
        System.out.println("修改之前的用户"+user);

        user.setAge(55);
        userService.updateUser(user);

        user= userService.findById(1);
        System.out.println("修改后的用户"+user);

    }

    //增加一个方法
    @Test
    public void testGit(){
        System.out.println("测试git同步");
    }
}
