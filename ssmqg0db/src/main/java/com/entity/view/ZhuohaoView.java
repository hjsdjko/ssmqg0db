package com.entity.view;

import com.entity.ZhuohaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 桌号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
@TableName("zhuohao")
public class ZhuohaoView  extends ZhuohaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuohaoView(){
	}
 
 	public ZhuohaoView(ZhuohaoEntity zhuohaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhuohaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
