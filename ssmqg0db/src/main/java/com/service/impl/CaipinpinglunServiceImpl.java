package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaipinpinglunDao;
import com.entity.CaipinpinglunEntity;
import com.service.CaipinpinglunService;
import com.entity.vo.CaipinpinglunVO;
import com.entity.view.CaipinpinglunView;

@Service("caipinpinglunService")
public class CaipinpinglunServiceImpl extends ServiceImpl<CaipinpinglunDao, CaipinpinglunEntity> implements CaipinpinglunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinpinglunEntity> page = this.selectPage(
                new Query<CaipinpinglunEntity>(params).getPage(),
                new EntityWrapper<CaipinpinglunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinpinglunEntity> wrapper) {
		  Page<CaipinpinglunView> page =new Query<CaipinpinglunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipinpinglunVO> selectListVO(Wrapper<CaipinpinglunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipinpinglunVO selectVO(Wrapper<CaipinpinglunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipinpinglunView> selectListView(Wrapper<CaipinpinglunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinpinglunView selectView(Wrapper<CaipinpinglunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
