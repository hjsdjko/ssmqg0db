package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuohaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuohaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuohaoView;


/**
 * 桌号
 *
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
public interface ZhuohaoService extends IService<ZhuohaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuohaoVO> selectListVO(Wrapper<ZhuohaoEntity> wrapper);
   	
   	ZhuohaoVO selectVO(@Param("ew") Wrapper<ZhuohaoEntity> wrapper);
   	
   	List<ZhuohaoView> selectListView(Wrapper<ZhuohaoEntity> wrapper);
   	
   	ZhuohaoView selectView(@Param("ew") Wrapper<ZhuohaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuohaoEntity> wrapper);
   	
}

