package com.entity.view;

import com.entity.DeyuchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 德育成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
@TableName("deyuchengji")
public class DeyuchengjiView  extends DeyuchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DeyuchengjiView(){
	}
 
 	public DeyuchengjiView(DeyuchengjiEntity deyuchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, deyuchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
