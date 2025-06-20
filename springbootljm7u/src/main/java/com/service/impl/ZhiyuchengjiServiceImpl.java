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


import com.dao.ZhiyuchengjiDao;
import com.entity.ZhiyuchengjiEntity;
import com.service.ZhiyuchengjiService;
import com.entity.vo.ZhiyuchengjiVO;
import com.entity.view.ZhiyuchengjiView;

@Service("zhiyuchengjiService")
public class ZhiyuchengjiServiceImpl extends ServiceImpl<ZhiyuchengjiDao, ZhiyuchengjiEntity> implements ZhiyuchengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuchengjiEntity> page = this.selectPage(
                new Query<ZhiyuchengjiEntity>(params).getPage(),
                new EntityWrapper<ZhiyuchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuchengjiEntity> wrapper) {
		  Page<ZhiyuchengjiView> page =new Query<ZhiyuchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuchengjiVO> selectListVO(Wrapper<ZhiyuchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuchengjiVO selectVO(Wrapper<ZhiyuchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuchengjiView> selectListView(Wrapper<ZhiyuchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuchengjiView selectView(Wrapper<ZhiyuchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
