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
@TableName("shuoshuo")
@ApiModel(value = "Shuoshuo对象", description = "")
public class Shuoshuo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("说说ID")
    @TableId(value = "ShuoShuoId", type = IdType.AUTO)
    private Integer shuoShuoId;

    @ApiModelProperty("说说标题")
    @TableField("Title")
    private String title;

    @ApiModelProperty("说说类别")
    @TableField("Type")
    private String type;

    @ApiModelProperty("说说内容")
    @TableField("Content")
    private String content;

    @ApiModelProperty("说说发布时间")
    @TableField("Time")
    private LocalDateTime time;

    @ApiModelProperty("说说所属用户的用户ID")
    @TableField("UserId")
    private Integer userId;

    @ApiModelProperty("审核(0为未通过,1为通过)")
    @TableField("Show")
    private Integer show;


}
