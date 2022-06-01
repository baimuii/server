package com.example.server.mapper;

import com.example.server.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baimuii
 * @since 2022-06-01
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
