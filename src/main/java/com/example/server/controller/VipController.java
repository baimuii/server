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

import com.example.server.service.IVipService;
import com.example.server.entity.Vip;

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
@RequestMapping("/vip")
public class VipController {
    /**引入Service*/
    @Resource
    private IVipService vipService;
    /**插入或更新*/
    @PostMapping
    public Boolean save(@RequestBody Vip vip) {
        return vipService.saveOrUpdate(vip);
    }
    /**根据id来删除*/
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return vipService.removeById(id);
    }
    /**查询全部数据库表中所有信息*/
    @GetMapping
    public List<Vip> findAll() {
        return vipService.list();
    }
    /**根据id来查询*/
    @GetMapping("/{id}")
    public Vip findOne(@PathVariable Integer id) {
        return vipService.getById(id);
    }
    /**
    * 分页查询
    * 但是具体细节没有写，需要自己手动写
    */
    @GetMapping("/page")
    public Page<Vip> findPage(@RequestParam Integer pageNum,
                                    @RequestParam Integer pageSize) {
        QueryWrapper<Vip> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        /**
        * 这里加入自己的细节
        * */
        return vipService.page(new Page<>(pageNum, pageSize),queryWrapper);
    }
}
