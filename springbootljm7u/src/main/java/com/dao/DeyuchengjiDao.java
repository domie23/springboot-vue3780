package com.dao;

import com.entity.DeyuchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DeyuchengjiVO;
import com.entity.view.DeyuchengjiView;


/**
 * 德育成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public interface DeyuchengjiDao extends BaseMapper<DeyuchengjiEntity> {
	
	List<DeyuchengjiVO> selectListVO(@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);
	
	DeyuchengjiVO selectVO(@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);
	
	List<DeyuchengjiView> selectListView(@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);

	List<DeyuchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);
	
	DeyuchengjiView selectView(@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);
	

}
