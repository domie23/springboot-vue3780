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


import com.dao.DeyuchengjiDao;
import com.entity.DeyuchengjiEntity;
import com.service.DeyuchengjiService;
import com.entity.vo.DeyuchengjiVO;
import com.entity.view.DeyuchengjiView;

@Service("deyuchengjiService")
public class DeyuchengjiServiceImpl extends ServiceImpl<DeyuchengjiDao, DeyuchengjiEntity> implements DeyuchengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DeyuchengjiEntity> page = this.selectPage(
                new Query<DeyuchengjiEntity>(params).getPage(),
                new EntityWrapper<DeyuchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DeyuchengjiEntity> wrapper) {
		  Page<DeyuchengjiView> page =new Query<DeyuchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DeyuchengjiVO> selectListVO(Wrapper<DeyuchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DeyuchengjiVO selectVO(Wrapper<DeyuchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DeyuchengjiView> selectListView(Wrapper<DeyuchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DeyuchengjiView selectView(Wrapper<DeyuchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
