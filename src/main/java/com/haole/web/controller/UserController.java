package com.haole.web.controller;

import com.haole.domain.User;
import com.haole.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询所有
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping("/findByUserid")
    public User findByUserid(Integer id) {
        return userService.findById(id);
    }

    /**
     * 更新用户
     *
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user) {
        System.out.println(user);
        userService.updateUser(user);
    }

    /**
     * 删除用户
     *
     * @param userId
     */
    @RequestMapping("/deleteUser")
    public void deleteUser(Integer userId) {
        System.out.println("删除用户id为：" + userId);
        int row = userService.deleteUser(userId);
        System.out.println("影响的行数为："+row);
        if (row == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @RequestMapping("/addUser")
    public void addUser(User user){
        System.out.println("新增的用户为："+user);
        int row= userService.addUser(user);
        System.out.println("row:"+row);
        if (row == 1){
            System.out.println("新增成功");
        }else {
            System.out.println("新增失败");
        }
    }
}
