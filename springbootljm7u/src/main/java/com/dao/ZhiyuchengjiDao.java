package com.dao;

import com.entity.ZhiyuchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuchengjiVO;
import com.entity.view.ZhiyuchengjiView;


/**
 * 智育成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public interface ZhiyuchengjiDao extends BaseMapper<ZhiyuchengjiEntity> {
	
	List<ZhiyuchengjiVO> selectListVO(@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);
	
	ZhiyuchengjiVO selectVO(@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);
	
	List<ZhiyuchengjiView> selectListView(@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);

	List<ZhiyuchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);
	
	ZhiyuchengjiView selectView(@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);
	

}
