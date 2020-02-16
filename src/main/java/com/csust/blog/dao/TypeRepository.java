package com.csust.blog.dao;

import com.csust.blog.entity.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author wq
 * @date 2020/2/12 20:11
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    @Query("select t from Type  t")
    List<Type> findTop(Pageable pageable);
}
