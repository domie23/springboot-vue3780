package com.entity.view;

import com.entity.TiyuchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体育成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
@TableName("tiyuchengji")
public class TiyuchengjiView  extends TiyuchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiyuchengjiView(){
	}
 
 	public TiyuchengjiView(TiyuchengjiEntity tiyuchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, tiyuchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
