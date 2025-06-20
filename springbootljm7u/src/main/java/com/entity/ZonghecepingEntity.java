package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 综合测评
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
@TableName("zongheceping")
public class ZonghecepingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghecepingEntity() {
		
	}
	
	public ZonghecepingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date lurushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
