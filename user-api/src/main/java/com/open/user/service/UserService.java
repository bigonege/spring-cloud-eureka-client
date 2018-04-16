package com.open.user.service;

import com.open.user.domain.User;

import java.util.Collection;

/**
 * 〈用户服务〉
 *
 * @Package com.open.user.service
 * @ClassName UserService
 * @Author wangky
 * @Create 2018/4/14 22:20
 */
public interface UserService {
    /**
     * 保存用户
     * @param user
     * @return 成功返回true 失败false
     */
    boolean save(User user);

    /**
     * 查询所有用户对象
     * @return 不会返回<code>null</code>
     */
    Collection<User> findAll();
}