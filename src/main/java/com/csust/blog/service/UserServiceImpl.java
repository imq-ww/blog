package com.csust.blog.service;

import com.csust.blog.dao.UserRepository;
import com.csust.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wq
 * @date 2020/2/12 15:51
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User userCheck(String username,String password) {
        User user = userRepository.findByUsernameAndPassword(username,password);
        return user;
    }
}
