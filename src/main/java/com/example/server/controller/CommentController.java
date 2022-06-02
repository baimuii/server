package com.example.server.controller;

/**
*
* controller模板
* 添加包
*/
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.example.server.service.ICommentService;
import com.example.server.entity.Comment;

import org.springframework.web.bind.annotation.RequestMapping;

    import org.springframework.web.bind.annotation.RestController;

/**
* <p>
    *  前端控制器
    * </p>
*
* @author baimuii
* @since 2022-06-02
*/
    @RestController
@RequestMapping("/comment")
        public class CommentController {
        /**引入Service*/
        @Resource
        private ICommentService commentService;
        /**插入或更新*/
        @PostMapping
        public Boolean save(@RequestBody Comment comment) {
            return commentService.saveOrUpdate(comment);
        }
        /**根据id来删除*/
        @DeleteMapping("/{id}")
        public Boolean delete(@PathVariable Integer id) {
            return commentService.removeById(id);
        }
        /**查询全部数据库表中所有信息*/
        @GetMapping
        public List<Comment> findAll() {
            return commentService.list();
        }
        /**根据id来查询*/
        @GetMapping("/{id}")
        public Comment findOne(@PathVariable Integer id) {
            return commentService.getById(id);
        }
        /**
        * 分页查询
        * 但是具体细节没有写，需要自己手动写
        */
        @GetMapping("/page")
        public Page<Comment> findPage(@RequestParam Integer pageNum,
                                        @RequestParam Integer pageSize) {
            QueryWrapper<Comment> queryWrapper=new QueryWrapper<>();
            queryWrapper.orderByDesc("id");
            /**
            * 这里加入自己的细节
            * */
            return commentService.page(new Page<>(pageNum, pageSize),queryWrapper);
        }
    }
