package edu.lingnan.service;

import edu.lingnan.entity.User;

import java.util.List;

public interface UserService {
    /**查找一个用户*/
    User findOne(Integer id);

    /**查找所有用户*/
    List<User> findAll();

    /**添加一个用户*/
    Integer save(User user);

    /**删除一个用户*/
    Integer delete(Integer id);

    /**修改一个用户*/
    Integer update(User user);
}
