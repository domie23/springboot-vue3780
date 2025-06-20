package com.dao;

import com.entity.TiyuchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiyuchengjiVO;
import com.entity.view.TiyuchengjiView;


/**
 * 体育成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public interface TiyuchengjiDao extends BaseMapper<TiyuchengjiEntity> {
	
	List<TiyuchengjiVO> selectListVO(@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);
	
	TiyuchengjiVO selectVO(@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);
	
	List<TiyuchengjiView> selectListView(@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);

	List<TiyuchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);
	
	TiyuchengjiView selectView(@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);
	

}
