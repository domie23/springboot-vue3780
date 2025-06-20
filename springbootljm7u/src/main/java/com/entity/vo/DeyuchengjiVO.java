package com.entity.vo;

import com.entity.DeyuchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 德育成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public class DeyuchengjiVO  implements Serializable {
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
	 * 基础成绩
	 */
	
	private Float jichuchengji;
		
	/**
	 * 加分
	 */
	
	private Float jiafen;
		
	/**
	 * 扣分
	 */
	
	private Float koufen;
		
	/**
	 * 比例
	 */
	
	private Float bili;
		
	/**
	 * 德育成绩
	 */
	
	private Float deyuchengji;
				
	
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
	 * 设置：基础成绩
	 */
	 
	public void setJichuchengji(Float jichuchengji) {
		this.jichuchengji = jichuchengji;
	}
	
	/**
	 * 获取：基础成绩
	 */
	public Float getJichuchengji() {
		return jichuchengji;
	}
				
	
	/**
	 * 设置：加分
	 */
	 
	public void setJiafen(Float jiafen) {
		this.jiafen = jiafen;
	}
	
	/**
	 * 获取：加分
	 */
	public Float getJiafen() {
		return jiafen;
	}
				
	
	/**
	 * 设置：扣分
	 */
	 
	public void setKoufen(Float koufen) {
		this.koufen = koufen;
	}
	
	/**
	 * 获取：扣分
	 */
	public Float getKoufen() {
		return koufen;
	}
				
	
	/**
	 * 设置：比例
	 */
	 
	public void setBili(Float bili) {
		this.bili = bili;
	}
	
	/**
	 * 获取：比例
	 */
	public Float getBili() {
		return bili;
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
			
}
