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
 * 体育成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
@TableName("tiyuchengji")
public class TiyuchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiyuchengjiEntity() {
		
	}
	
	public TiyuchengjiEntity(T t) {
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
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 学年
	 */
					
	private String xuenian;
	
	/**
	 * 体育分
	 */
					
	private Float tiyufen;
	
	/**
	 * 比例
	 */
					
	private Float bili;
	
	/**
	 * 体育成绩
	 */
					
	private Float tiyuchengji;
	
	
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
	 * 设置：体育分
	 */
	public void setTiyufen(Float tiyufen) {
		this.tiyufen = tiyufen;
	}
	/**
	 * 获取：体育分
	 */
	public Float getTiyufen() {
		return tiyufen;
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

}
