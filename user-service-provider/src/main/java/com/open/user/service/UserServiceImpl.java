package com.open.user.service;

import com.netflix.discovery.converters.Auto;
import com.open.user.domain.User;
import com.open.user.repostitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 〈〉
 *
 * @Package com.open.user
 * @ClassName UserServiceImpl
 * @Author wangky
 * @Create 2018/4/14 22:41
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    /**
     * 保存用户
     *
     * @param user
     * @return 成功返回true 失败false
     */
    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    /**
     * 查询所有用户对象
     *
     * @return 不会返回<code>null</code>
     */
    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}