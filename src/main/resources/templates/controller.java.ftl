package ${package.Controller};

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

import ${package.Service}.${table.serviceName};
import ${package.Entity}.${entity};

import org.springframework.web.bind.annotation.RequestMapping;

<#if restControllerStyle>
    import org.springframework.web.bind.annotation.RestController;
<#else>
    import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
    import ${superControllerClassPackage};
</#if>

/**
* <p>
    * ${table.comment!} 前端控制器
    * </p>
*
* @author ${author}
* @since ${date}
*/
<#if restControllerStyle>
    @RestController
<#else>
    @Controller
</#if>
@RequestMapping("<#if package.ModuleName?? && package.ModuleName != "">/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle??>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
    class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
    <#if superControllerClass??>
        public class ${table.controllerName} extends ${superControllerClass} {
    <#else>
        public class ${table.controllerName} {
    </#if>
        /**引入Service*/
        @Resource
        private ${table.serviceName} ${table.entityPath}Service;
        /**插入或更新*/
        @PostMapping
        public Boolean save(@RequestBody ${entity} ${table.entityPath}) {
            return ${table.entityPath}Service.saveOrUpdate(${table.entityPath});
        }
        /**根据id来删除*/
        @DeleteMapping("/{id}")
        public Boolean delete(@PathVariable Integer id) {
            return ${table.entityPath}Service.removeById(id);
        }
        /**查询全部数据库表中所有信息*/
        @GetMapping
        public List<${entity}> findAll() {
            return ${table.entityPath}Service.list();
        }
        /**根据id来查询*/
        @GetMapping("/{id}")
        public ${entity} findOne(@PathVariable Integer id) {
            return ${table.entityPath}Service.getById(id);
        }
        /**
        * 分页查询
        * 但是具体细节没有写，需要自己手动写
        */
        @GetMapping("/page")
        public Page<${entity}> findPage(@RequestParam Integer pageNum,
                                        @RequestParam Integer pageSize) {
            QueryWrapper<${entity}> queryWrapper=new QueryWrapper<>();
            queryWrapper.orderByDesc("id");
            /**
            * 这里加入自己的细节
            * */
            return ${table.entityPath}Service.page(new Page<>(pageNum, pageSize),queryWrapper);
        }
    }
</#if>
