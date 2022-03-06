package com.liuyanzhao.yztool.common.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 基础实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseEntity<T extends Model<T>> extends Model<T>
{

    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 创建人姓名
     */
    private String creatorId;
    /**
     * 修改人姓名
     */
    private String updaterId;
    /**
     * 是否有效(0:有效 1:无效)
     */
    @TableLogic
    private Boolean delFlag;

}
