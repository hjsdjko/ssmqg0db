package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinpinglunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinpinglunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinpinglunView;


/**
 * 菜品评论
 *
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
public interface CaipinpinglunService extends IService<CaipinpinglunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinpinglunVO> selectListVO(Wrapper<CaipinpinglunEntity> wrapper);
   	
   	CaipinpinglunVO selectVO(@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);
   	
   	List<CaipinpinglunView> selectListView(Wrapper<CaipinpinglunEntity> wrapper);
   	
   	CaipinpinglunView selectView(@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinpinglunEntity> wrapper);
   	
}

