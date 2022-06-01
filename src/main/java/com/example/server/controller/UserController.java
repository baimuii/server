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

import com.example.server.service.IUserService;
import com.example.server.entity.User;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author baimuii
 * @since 2022-06-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
        /**引入Service*/
        @Resource
        private IUserService userService;
        /**插入或更新*/
        @PostMapping
        public Boolean save(@RequestBody User user) {
            return userService.saveOrUpdate(user);
        }
        /**根据id来删除*/
        @DeleteMapping("/{id}")
        public Boolean delete(@PathVariable Integer id) {
            return userService.removeById(id);
        }
        /**查询全部数据库表中所有信息*/
        @GetMapping
        public List<User> findAll() {
            return userService.list();
        }
        /**根据id来查询*/
        @GetMapping("/{id}")
        public User findOne(@PathVariable Integer id) {
            return userService.getById(id);
        }
        /**
        * 分页查询
        * 但是具体细节没有写，需要自己手动写
        */
        @GetMapping("/page")
        public Page<User> findPage(@RequestParam Integer pageNum,
                                        @RequestParam Integer pageSize) {
            QueryWrapper<User> queryWrapper=new QueryWrapper<>();
            queryWrapper.orderByDesc("id");
            /**
            * 这里加入自己的细节
            * */
            return userService.page(new Page<>(pageNum, pageSize),queryWrapper);
        }

}

