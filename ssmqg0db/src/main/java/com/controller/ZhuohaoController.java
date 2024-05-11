package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuohaoEntity;
import com.entity.view.ZhuohaoView;

import com.service.ZhuohaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 桌号
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-17 22:41:25
 */
@RestController
@RequestMapping("/zhuohao")
public class ZhuohaoController {
    @Autowired
    private ZhuohaoService zhuohaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuohaoEntity zhuohao, 
		HttpServletRequest request){

        EntityWrapper<ZhuohaoEntity> ew = new EntityWrapper<ZhuohaoEntity>();
		PageUtils page = zhuohaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuohao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuohaoEntity zhuohao, HttpServletRequest request){
        EntityWrapper<ZhuohaoEntity> ew = new EntityWrapper<ZhuohaoEntity>();
		PageUtils page = zhuohaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuohao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuohaoEntity zhuohao){
       	EntityWrapper<ZhuohaoEntity> ew = new EntityWrapper<ZhuohaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuohao, "zhuohao")); 
        return R.ok().put("data", zhuohaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuohaoEntity zhuohao){
        EntityWrapper< ZhuohaoEntity> ew = new EntityWrapper< ZhuohaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuohao, "zhuohao")); 
		ZhuohaoView zhuohaoView =  zhuohaoService.selectView(ew);
		return R.ok("查询桌号成功").put("data", zhuohaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuohaoEntity zhuohao = zhuohaoService.selectById(id);
        return R.ok().put("data", zhuohao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuohaoEntity zhuohao = zhuohaoService.selectById(id);
        return R.ok().put("data", zhuohao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuohaoEntity zhuohao, HttpServletRequest request){
    	zhuohao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuohao);

        zhuohaoService.insert(zhuohao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuohaoEntity zhuohao, HttpServletRequest request){
    	zhuohao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuohao);

        zhuohaoService.insert(zhuohao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuohaoEntity zhuohao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuohao);
        zhuohaoService.updateById(zhuohao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuohaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuohaoEntity> wrapper = new EntityWrapper<ZhuohaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zhuohaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
