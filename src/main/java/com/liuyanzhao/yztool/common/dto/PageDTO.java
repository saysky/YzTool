package com.liuyanzhao.yztool.common.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 分页DTO
 * @author liuyanzhao
 */
@Data
public class PageDTO {
    /**
     * start
     * 开始
     */
    @NotNull
    private Integer page =1;
    /**
     * length
     * 条数
     */
    @NotNull
    private Integer limit =10;

}
