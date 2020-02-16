package com.csust.blog.service;

import com.csust.blog.entity.User;

/**
 * @author wq
 * @date 2020/2/12 15:50
 */
public interface UserService {
    User userCheck(String username,String password);
}
