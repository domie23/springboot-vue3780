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


import com.dao.TiyuchengjiDao;
import com.entity.TiyuchengjiEntity;
import com.service.TiyuchengjiService;
import com.entity.vo.TiyuchengjiVO;
import com.entity.view.TiyuchengjiView;

@Service("tiyuchengjiService")
public class TiyuchengjiServiceImpl extends ServiceImpl<TiyuchengjiDao, TiyuchengjiEntity> implements TiyuchengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiyuchengjiEntity> page = this.selectPage(
                new Query<TiyuchengjiEntity>(params).getPage(),
                new EntityWrapper<TiyuchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiyuchengjiEntity> wrapper) {
		  Page<TiyuchengjiView> page =new Query<TiyuchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiyuchengjiVO> selectListVO(Wrapper<TiyuchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiyuchengjiVO selectVO(Wrapper<TiyuchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiyuchengjiView> selectListView(Wrapper<TiyuchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiyuchengjiView selectView(Wrapper<TiyuchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
