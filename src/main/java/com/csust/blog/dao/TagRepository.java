package com.csust.blog.dao;

import com.csust.blog.entity.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author wq
 * @date 2020/2/13 0:36
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String  name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
