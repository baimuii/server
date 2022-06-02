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
@TableName("admin")
@ApiModel(value = "Admin对象", description = "")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("管理员ID")
    @TableId(value = "AdminId", type = IdType.AUTO)
    private Integer adminId;

    @ApiModelProperty("管理员昵称")
    @TableField("AdminName")
    private String adminName;

    @ApiModelProperty("管理员密码")
    @TableField("AdminPassword")
    private String adminPassword;

    @ApiModelProperty("管理员创建时间")
    @TableField("Time")
    private LocalDateTime time;


}
