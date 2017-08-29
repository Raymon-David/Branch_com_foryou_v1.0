package com.foryou.common.model;

import java.io.Serializable;

import net.sf.json.JSONObject;
/**
 * 
 * 开发公司：foryou.com<br/>
 * 版权：foryou.com<br/>
 * <p>
 * 
 * 用户{@link UUser} 和角色 {@link URole} 中间表
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　zwg　2016年5月25日 　<br/>
 * <p>
 * *******
 * <p>
 * @author zwg
 * @email  i@foryou.com
 * @version 1.0,2016年5月25日 <br/>
 * 
 */
public class UUserRole  implements Serializable{
	private static final long serialVersionUID = 1L;
	 /**{@link UUser.id}*/
    private Long uid;
    /**{@link URole.id}*/
    private Long rid;

    public UUserRole(Long uid,Long rid) {
    	this.uid = uid;
    	this.rid = rid;
	}
    public UUserRole() {
    }
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
    public String toString(){
    	return JSONObject.fromObject(this).toString();
    }
}