package com.liuyanzhao.yztool.common.util;

import java.util.List;

/**
 * List工具类
 *
 * @author 言曌
 * @date 2022/3/6 8:54 PM
 */

public class ListUtil {

    /**
     * 是否为空
     *
     * @param list
     * @return
     */
    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    /**
     * 是否不为空
     *
     * @param list
     * @return
     */
    public static boolean isNotEmpty(List list) {
        return !isEmpty(list);
    }
}
