package com.entity.model;

import com.entity.XiaoshoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 销售统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
public class XiaoshoutongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 菜品名称
	 */
	
	private String caipinmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 菜系
	 */
	
	private String caixi;
		
	/**
	 * 销售量
	 */
	
	private Integer xiaoshouliang;
		
	/**
	 * 总利润
	 */
	
	private Integer zonglirun;
		
	/**
	 * 统计时间
	 */
	
	private String tongjishijian;
				
	
	/**
	 * 设置：菜品名称
	 */
	 
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：菜系
	 */
	 
	public void setCaixi(String caixi) {
		this.caixi = caixi;
	}
	
	/**
	 * 获取：菜系
	 */
	public String getCaixi() {
		return caixi;
	}
				
	
	/**
	 * 设置：销售量
	 */
	 
	public void setXiaoshouliang(Integer xiaoshouliang) {
		this.xiaoshouliang = xiaoshouliang;
	}
	
	/**
	 * 获取：销售量
	 */
	public Integer getXiaoshouliang() {
		return xiaoshouliang;
	}
				
	
	/**
	 * 设置：总利润
	 */
	 
	public void setZonglirun(Integer zonglirun) {
		this.zonglirun = zonglirun;
	}
	
	/**
	 * 获取：总利润
	 */
	public Integer getZonglirun() {
		return zonglirun;
	}
				
	
	/**
	 * 设置：统计时间
	 */
	 
	public void setTongjishijian(String tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	
	/**
	 * 获取：统计时间
	 */
	public String getTongjishijian() {
		return tongjishijian;
	}
			
}
