package com.foryou.core.shiro.cache;

import org.apache.shiro.cache.Cache;

/**
 * 
 * 开发公司：foryou在线工具 <p>
 * 版权所有：© www.foryou.com<p>
 * 博客地址：http://www.foryou.com/blog/  <p>
 * <p>
 * 
 * shiro cache manager 接口
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2016年6月2日 　<br/>
 *
 * @author zwg
 * @email  so@foryou.com
 * @version 1.0,2016年6月2日 <br/>
 * 
 */
public interface ShiroCacheManager {

    <K, V> Cache<K, V> getCache(String name);

    void destroy();

}
