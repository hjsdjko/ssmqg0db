package com.dao;

import com.entity.ZhuohaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuohaoVO;
import com.entity.view.ZhuohaoView;


/**
 * 桌号
 * 
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
public interface ZhuohaoDao extends BaseMapper<ZhuohaoEntity> {
	
	List<ZhuohaoVO> selectListVO(@Param("ew") Wrapper<ZhuohaoEntity> wrapper);
	
	ZhuohaoVO selectVO(@Param("ew") Wrapper<ZhuohaoEntity> wrapper);
	
	List<ZhuohaoView> selectListView(@Param("ew") Wrapper<ZhuohaoEntity> wrapper);

	List<ZhuohaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuohaoEntity> wrapper);
	
	ZhuohaoView selectView(@Param("ew") Wrapper<ZhuohaoEntity> wrapper);
	
}
