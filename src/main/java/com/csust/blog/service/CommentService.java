package com.csust.blog.service;

import com.csust.blog.entity.Comment;

import java.util.List;

/**
 * @author wq
 * @date 2020/2/14 17:52
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
