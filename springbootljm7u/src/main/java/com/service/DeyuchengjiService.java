package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DeyuchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DeyuchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DeyuchengjiView;


/**
 * 德育成绩
 *
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public interface DeyuchengjiService extends IService<DeyuchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DeyuchengjiVO> selectListVO(Wrapper<DeyuchengjiEntity> wrapper);
   	
   	DeyuchengjiVO selectVO(@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);
   	
   	List<DeyuchengjiView> selectListView(Wrapper<DeyuchengjiEntity> wrapper);
   	
   	DeyuchengjiView selectView(@Param("ew") Wrapper<DeyuchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DeyuchengjiEntity> wrapper);
   	

}

