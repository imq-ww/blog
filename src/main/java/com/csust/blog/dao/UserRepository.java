package com.csust.blog.dao;

import com.csust.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wq
 * @date 2020/2/12 15:52
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username,String password);
}
