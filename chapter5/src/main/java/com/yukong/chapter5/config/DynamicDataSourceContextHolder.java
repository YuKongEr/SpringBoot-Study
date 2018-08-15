package com.yukong.chapter5.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/15 10:49
 * @Description:
 */
public class DynamicDataSourceContextHolder {



    private static Logger logger = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);

    /**
     * 线程级别的私有变量
     */
    private static final ThreadLocal<String> HOLDER = new ThreadLocal<>();

    public static String getDataSourceRouterKey () {
        return HOLDER.get();
    }

    public static void setDataSourceRouterKey (String dataSourceRouterKey) {
        logger.debug("切换至{}数据源", dataSourceRouterKey);
        HOLDER.set(dataSourceRouterKey);
    }

    /**
     * 设置数据源之前一定要先移除
     */
    public static void removeDataSourceRouterKey () {
        HOLDER.remove();
    }

}
