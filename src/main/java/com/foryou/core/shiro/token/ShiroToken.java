package com.foryou.core.shiro.token;

import org.apache.shiro.authc.UsernamePasswordToken;
/**
 * 
 * 开发公司：foryou在线工具 <p>
 * 版权所有：© www.foryou.com<p>
 * 博客地址：http://www.foryou.com/blog/  <p>
 * <p>
 * 
 * Shiro token
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　zwg　2016年6月2日 　<br/>
 *
 * @author zwg
 * @email  so@foryou.com
 * @version 1.0,2016年6月2日 <br/>
 * 
 */
public class ShiroToken extends UsernamePasswordToken  implements java.io.Serializable{
	
	private static final long serialVersionUID = -6451794657814516274L;

	public ShiroToken(String username, String pswd) {
		super(username,pswd);
		this.pswd = pswd ;
	}
	
	
	/** 登录密码[字符串类型] 因为父类是char[] ] **/
	private String pswd ;

	public String getPswd() {
		return pswd;
	}


	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
	
	
	
}
