package com.haole.service;

import com.haole.domain.User;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

/**
 * 用户的业务层接口
 */
public interface IUserService {

    /**
     * 查询用户列表
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     *更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     *
     * @param userId
     */
    int deleteUser(Integer userId);

    /**
     * 新增用户
     * @param user
     * @return
     */
    int addUser(User user);

}
