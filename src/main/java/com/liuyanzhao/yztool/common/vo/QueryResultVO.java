package com.liuyanzhao.yztool.common.vo;

import lombok.Data;

import java.util.List;

/**
 * 查询结果
 *
 * @author 言曌
 * @date 2022/1/26 11:55 下午
 */
@Data
public class QueryResultVO {

    /**
     * 字段列表
     */
    private List<String> columnList;

    /**
     * 数据列表
     */
    private List<List<String>> dataList;

    /**
     * 总数
     */
    private Long total;

    /**
     * 是否为查询
     */
    private boolean queryFlag;
}
