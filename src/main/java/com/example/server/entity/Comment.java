package com.example.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author baimuii
 * @since 2022-05-31
 */
@Getter
@Setter
@Data
  @TableName("comment")
@ApiModel(value = "Comment对象", description = "")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("评论ID")
        @TableId(value = "CommentId", type = IdType.AUTO)
      private Integer commentId;

      @ApiModelProperty("评论内容")
      @TableField("Content")
    private String content;

      @ApiModelProperty("评论发布时间")
      @TableField("Time")
    private LocalDateTime time;

      @ApiModelProperty("发布评论的用户ID")
      @TableField("UserId")
    private Integer userId;

      @ApiModelProperty("发布在哪个说说的说说ID")
      @TableField("ShuoShuoId")
    private Integer shuoShuoId;

      @ApiModelProperty("审核(0为未通过审核,1为通过审核)")
      @TableField("Show")
    private Integer show;


}
