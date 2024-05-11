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


import com.dao.ZhuohaoDao;
import com.entity.ZhuohaoEntity;
import com.service.ZhuohaoService;
import com.entity.vo.ZhuohaoVO;
import com.entity.view.ZhuohaoView;

@Service("zhuohaoService")
public class ZhuohaoServiceImpl extends ServiceImpl<ZhuohaoDao, ZhuohaoEntity> implements ZhuohaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuohaoEntity> page = this.selectPage(
                new Query<ZhuohaoEntity>(params).getPage(),
                new EntityWrapper<ZhuohaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuohaoEntity> wrapper) {
		  Page<ZhuohaoView> page =new Query<ZhuohaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuohaoVO> selectListVO(Wrapper<ZhuohaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuohaoVO selectVO(Wrapper<ZhuohaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuohaoView> selectListView(Wrapper<ZhuohaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuohaoView selectView(Wrapper<ZhuohaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
