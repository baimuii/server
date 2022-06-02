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
@TableName("vip")
@ApiModel(value = "Vip对象", description = "")
public class Vip implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("会员ID")
    @TableId(value = "VipId", type = IdType.AUTO)
    private Integer vipId;

    @ApiModelProperty("成为会员的时间")
    @TableField("Time")
    private LocalDateTime time;

    @ApiModelProperty("用户成为会员的用户ID")
    @TableField("UserId")
    private Integer userId;


}
