package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiyuchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiyuchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuchengjiView;


/**
 * 体育成绩
 *
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public interface TiyuchengjiService extends IService<TiyuchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiyuchengjiVO> selectListVO(Wrapper<TiyuchengjiEntity> wrapper);
   	
   	TiyuchengjiVO selectVO(@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);
   	
   	List<TiyuchengjiView> selectListView(Wrapper<TiyuchengjiEntity> wrapper);
   	
   	TiyuchengjiView selectView(@Param("ew") Wrapper<TiyuchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiyuchengjiEntity> wrapper);
   	

}

