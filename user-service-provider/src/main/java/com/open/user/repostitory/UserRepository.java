package com.open.user.repostitory;

import com.open.user.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 〈〉
 *
 * @Package com.open.user.repostitory
 * @ClassName UserRepository
 * @Author wangky
 * @Create 2018/4/14 22:42
 */
@Repository
public class UserRepository {
    private ConcurrentMap<Long,User> map = new ConcurrentHashMap<Long, User>() ;
    private static final AtomicLong id = new AtomicLong(0);
    public boolean save(User user){
        Long userid = id.incrementAndGet();
        user.setId(userid);
        return  map.putIfAbsent(userid,user)==null;
    }
    public Collection<User> findAll(){
        return map.values();
    }
}