package com.fairychar.s1.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableField;
/**
 * (MessageInfo)表实体类
 *
 * @author chiyo
 * @since 2023-03-19 20:34:12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("serial")
@ApiModel("MessageInfo")
public class MessageInfo extends Model<MessageInfo> {
    @ApiModelProperty("")
    @TableField(value = "text1")
    private String text1;
    @ApiModelProperty("")
    @TableField(value = "text2")
    private String text2;
    @ApiModelProperty("")
    @TableField(value = "text3")
    private String text3;




    /**
    * text1 - 
    */
    public final static String TEXT1 = "text1";

    /**
    * text2 - 
    */
    public final static String TEXT2 = "text2";

    /**
    * text3 - 
    */
    public final static String TEXT3 = "text3";

}
