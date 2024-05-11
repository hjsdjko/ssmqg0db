package com.dao;

import com.entity.CaipinpinglunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipinpinglunVO;
import com.entity.view.CaipinpinglunView;


/**
 * 菜品评论
 * 
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
public interface CaipinpinglunDao extends BaseMapper<CaipinpinglunEntity> {
	
	List<CaipinpinglunVO> selectListVO(@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);
	
	CaipinpinglunVO selectVO(@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);
	
	List<CaipinpinglunView> selectListView(@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);

	List<CaipinpinglunView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);
	
	CaipinpinglunView selectView(@Param("ew") Wrapper<CaipinpinglunEntity> wrapper);
	
}
