package com.example.server.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 代码生成器
 * by Baimuii
 *
 *
 */

public class CodeGenerator {

    public static void main(String[] args) {
        generator();
    }
    private static void generator(){
        /**数据库配置*/
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/shuoshuo?serverTimezone=Asia/Shanghai", "root", "2999")
                .globalConfig(builder -> {
                    builder.author("baimuii") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Users\\baimuii\\Desktop\\说说管理系统\\server\\src\\main\\java\\"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.server") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "C:\\Users\\baimuii\\Desktop\\说说管理系统\\server\\src\\main\\resources\\mapper\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("admin") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            .entityBuilder()   //实体类策略配置
                            .enableLombok()    //打开Lombok
                            .enableTableFieldAnnotation()//属性上加上注解
                            .mapperBuilder()    //mapper策略配置
                            .enableMapperAnnotation() //开启 @Mapper 注解
                            .controllerBuilder() //controller配置
                            .enableHyphenStyle() // 开启驼峰转连字符
                            .enableRestStyle();  // 开启生成@RestController 控制器
                })
                /**
                 * 使用Freemarker引擎模板，默认的是Velocity引擎模板
                 */
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
