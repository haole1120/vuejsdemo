package com.haole.dao;

import com.haole.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询用户列表
     *
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询
     *
     * @param userId
     * @return
     */
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);

    /**
     * 更新用户
     *
     * @param user
     */
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);

    /**
     *
     * @param userId
     * @return
     */
    @Delete("delete from user where id=#{userId}")
    int deleteUser(Integer userId);

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Insert("insert into user(username,password,age,sex,email) values(username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email}) ")
    int addUser(User user);
}
