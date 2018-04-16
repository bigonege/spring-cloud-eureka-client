package com.open.user.web;

import com.open.user.domain.User;
import com.open.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * 〈〉
 *
 * @Package com.open.user.web
 * @ClassName UserServiceProxy
 * @Author wangky
 * @Create 2018/4/14 23:28
 */
@Service
public class UserServiceProxy implements UserService {

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://user-servcie-provider";
    @Autowired
    RestTemplate restTemplate;
    /**
     * 保存用户
     *
     * @param user
     * @return 成功返回true 失败false
     */
    @Override
    public boolean save(User user) {
        User user1 = restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user/save", user, User.class);
        return user1 != null;
    }

    /**
     * 查询所有用户对象
     *
     * @return 不会返回<code>null</code>
     */
    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX + "/user/list",Collection.class);

    }
}