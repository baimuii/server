package com.example.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author baimuii
 * @since 2022-06-02
 */
@Getter
@Setter
@TableName("user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID")
    @TableId(value = "UserId", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("用户昵称")
    @TableField("UserName")
    private String userName;

    @ApiModelProperty("用户密码")
    @TableField("UserPassword")
    private String userPassword;

    @ApiModelProperty("用户创建时间")
    @TableField("Time")
    private LocalDateTime time;

    @ApiModelProperty("用户性别")
    @TableField("UserSex")
    private String userSex;

}
