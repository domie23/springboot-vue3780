package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuchengjiView;


/**
 * 智育成绩
 *
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public interface ZhiyuchengjiService extends IService<ZhiyuchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuchengjiVO> selectListVO(Wrapper<ZhiyuchengjiEntity> wrapper);
   	
   	ZhiyuchengjiVO selectVO(@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);
   	
   	List<ZhiyuchengjiView> selectListView(Wrapper<ZhiyuchengjiEntity> wrapper);
   	
   	ZhiyuchengjiView selectView(@Param("ew") Wrapper<ZhiyuchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuchengjiEntity> wrapper);
   	

}

