package com.example.server.service.impl;

import com.example.server.entity.Comment;
import com.example.server.mapper.CommentMapper;
import com.example.server.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author baimuii
 * @since 2022-05-31
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
