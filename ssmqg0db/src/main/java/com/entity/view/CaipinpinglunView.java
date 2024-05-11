package com.entity.view;

import com.entity.CaipinpinglunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品评论
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
@TableName("caipinpinglun")
public class CaipinpinglunView  extends CaipinpinglunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinpinglunView(){
	}
 
 	public CaipinpinglunView(CaipinpinglunEntity caipinpinglunEntity){
 	try {
			BeanUtils.copyProperties(this, caipinpinglunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
