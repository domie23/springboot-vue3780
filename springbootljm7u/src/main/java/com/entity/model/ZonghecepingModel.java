package com.entity.model;

import com.entity.ZonghecepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 综合测评
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public class ZonghecepingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班主任工号
	 */
	
	private String banzhurengonghao;
		
	/**
	 * 班主任姓名
	 */
	
	private String banzhurenxingming;
		
	/**
	 * 学年
	 */
	
	private String xuenian;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 体育成绩
	 */
	
	private Float tiyuchengji;
		
	/**
	 * 德育成绩
	 */
	
	private Float deyuchengji;
		
	/**
	 * 智育成绩
	 */
	
	private Float zhiyuchengji;
		
	/**
	 * 综合成绩
	 */
	
	private Float zonghechengji;
		
	/**
	 * 录入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lurushijian;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班主任工号
	 */
	 
	public void setBanzhurengonghao(String banzhurengonghao) {
		this.banzhurengonghao = banzhurengonghao;
	}
	
	/**
	 * 获取：班主任工号
	 */
	public String getBanzhurengonghao() {
		return banzhurengonghao;
	}
				
	
	/**
	 * 设置：班主任姓名
	 */
	 
	public void setBanzhurenxingming(String banzhurenxingming) {
		this.banzhurenxingming = banzhurenxingming;
	}
	
	/**
	 * 获取：班主任姓名
	 */
	public String getBanzhurenxingming() {
		return banzhurenxingming;
	}
				
	
	/**
	 * 设置：学年
	 */
	 
	public void setXuenian(String xuenian) {
		this.xuenian = xuenian;
	}
	
	/**
	 * 获取：学年
	 */
	public String getXuenian() {
		return xuenian;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：体育成绩
	 */
	 
	public void setTiyuchengji(Float tiyuchengji) {
		this.tiyuchengji = tiyuchengji;
	}
	
	/**
	 * 获取：体育成绩
	 */
	public Float getTiyuchengji() {
		return tiyuchengji;
	}
				
	
	/**
	 * 设置：德育成绩
	 */
	 
	public void setDeyuchengji(Float deyuchengji) {
		this.deyuchengji = deyuchengji;
	}
	
	/**
	 * 获取：德育成绩
	 */
	public Float getDeyuchengji() {
		return deyuchengji;
	}
				
	
	/**
	 * 设置：智育成绩
	 */
	 
	public void setZhiyuchengji(Float zhiyuchengji) {
		this.zhiyuchengji = zhiyuchengji;
	}
	
	/**
	 * 获取：智育成绩
	 */
	public Float getZhiyuchengji() {
		return zhiyuchengji;
	}
				
	
	/**
	 * 设置：综合成绩
	 */
	 
	public void setZonghechengji(Float zonghechengji) {
		this.zonghechengji = zonghechengji;
	}
	
	/**
	 * 获取：综合成绩
	 */
	public Float getZonghechengji() {
		return zonghechengji;
	}
				
	
	/**
	 * 设置：录入时间
	 */
	 
	public void setLurushijian(Date lurushijian) {
		this.lurushijian = lurushijian;
	}
	
	/**
	 * 获取：录入时间
	 */
	public Date getLurushijian() {
		return lurushijian;
	}
			
}
