package com.entity.vo;

import com.entity.ZhiyuchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 智育成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-21 12:11:49
 */
public class ZhiyuchengjiVO  implements Serializable {
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
	 * 数据结构与算法
	 */
	
	private Float shujujiegouyusuanfa;
		
	/**
	 * c语言
	 */
	
	private Float cyuyan;
		
	/**
	 * 高数1
	 */
	
	private Float gaoshu1;
		
	/**
	 * 数据库系统
	 */
	
	private Float shujukuxitong;
		
	/**
	 * 英语1
	 */
	
	private Float yingyu1;
		
	/**
	 * python
	 */
	
	private Float python;
		
	/**
	 * 高数2
	 */
	
	private Float gaoshu2;
		
	/**
	 * 英语2
	 */
	
	private Float yingyu2;
		
	/**
	 * 计算机网络
	 */
	
	private Float jisuanjiwangluo;
		
	/**
	 * 操作系统
	 */
	
	private Float caozuoxitong;
		
	/**
	 * 软件工程
	 */
	
	private Float ruanjiangongcheng;
		
	/**
	 * 编译原理
	 */
	
	private Float bianyiyuanli;
		
	/**
	 * 信息安全
	 */
	
	private Float xinxianquan;
		
	/**
	 * 平均值
	 */
	
	private Float pingjunzhi;
		
	/**
	 * 比例
	 */
	
	private Float bili;
		
	/**
	 * 智育成绩
	 */
	
	private Float zhiyuchengji;
				
	
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
	 * 设置：数据结构与算法
	 */
	 
	public void setShujujiegouyusuanfa(Float shujujiegouyusuanfa) {
		this.shujujiegouyusuanfa = shujujiegouyusuanfa;
	}
	
	/**
	 * 获取：数据结构与算法
	 */
	public Float getShujujiegouyusuanfa() {
		return shujujiegouyusuanfa;
	}
				
	
	/**
	 * 设置：c语言
	 */
	 
	public void setCyuyan(Float cyuyan) {
		this.cyuyan = cyuyan;
	}
	
	/**
	 * 获取：c语言
	 */
	public Float getCyuyan() {
		return cyuyan;
	}
				
	
	/**
	 * 设置：高数1
	 */
	 
	public void setGaoshu1(Float gaoshu1) {
		this.gaoshu1 = gaoshu1;
	}
	
	/**
	 * 获取：高数1
	 */
	public Float getGaoshu1() {
		return gaoshu1;
	}
				
	
	/**
	 * 设置：数据库系统
	 */
	 
	public void setShujukuxitong(Float shujukuxitong) {
		this.shujukuxitong = shujukuxitong;
	}
	
	/**
	 * 获取：数据库系统
	 */
	public Float getShujukuxitong() {
		return shujukuxitong;
	}
				
	
	/**
	 * 设置：英语1
	 */
	 
	public void setYingyu1(Float yingyu1) {
		this.yingyu1 = yingyu1;
	}
	
	/**
	 * 获取：英语1
	 */
	public Float getYingyu1() {
		return yingyu1;
	}
				
	
	/**
	 * 设置：python
	 */
	 
	public void setPython(Float python) {
		this.python = python;
	}
	
	/**
	 * 获取：python
	 */
	public Float getPython() {
		return python;
	}
				
	
	/**
	 * 设置：高数2
	 */
	 
	public void setGaoshu2(Float gaoshu2) {
		this.gaoshu2 = gaoshu2;
	}
	
	/**
	 * 获取：高数2
	 */
	public Float getGaoshu2() {
		return gaoshu2;
	}
				
	
	/**
	 * 设置：英语2
	 */
	 
	public void setYingyu2(Float yingyu2) {
		this.yingyu2 = yingyu2;
	}
	
	/**
	 * 获取：英语2
	 */
	public Float getYingyu2() {
		return yingyu2;
	}
				
	
	/**
	 * 设置：计算机网络
	 */
	 
	public void setJisuanjiwangluo(Float jisuanjiwangluo) {
		this.jisuanjiwangluo = jisuanjiwangluo;
	}
	
	/**
	 * 获取：计算机网络
	 */
	public Float getJisuanjiwangluo() {
		return jisuanjiwangluo;
	}
				
	
	/**
	 * 设置：操作系统
	 */
	 
	public void setCaozuoxitong(Float caozuoxitong) {
		this.caozuoxitong = caozuoxitong;
	}
	
	/**
	 * 获取：操作系统
	 */
	public Float getCaozuoxitong() {
		return caozuoxitong;
	}
				
	
	/**
	 * 设置：软件工程
	 */
	 
	public void setRuanjiangongcheng(Float ruanjiangongcheng) {
		this.ruanjiangongcheng = ruanjiangongcheng;
	}
	
	/**
	 * 获取：软件工程
	 */
	public Float getRuanjiangongcheng() {
		return ruanjiangongcheng;
	}
				
	
	/**
	 * 设置：编译原理
	 */
	 
	public void setBianyiyuanli(Float bianyiyuanli) {
		this.bianyiyuanli = bianyiyuanli;
	}
	
	/**
	 * 获取：编译原理
	 */
	public Float getBianyiyuanli() {
		return bianyiyuanli;
	}
				
	
	/**
	 * 设置：信息安全
	 */
	 
	public void setXinxianquan(Float xinxianquan) {
		this.xinxianquan = xinxianquan;
	}
	
	/**
	 * 获取：信息安全
	 */
	public Float getXinxianquan() {
		return xinxianquan;
	}
				
	
	/**
	 * 设置：平均值
	 */
	 
	public void setPingjunzhi(Float pingjunzhi) {
		this.pingjunzhi = pingjunzhi;
	}
	
	/**
	 * 获取：平均值
	 */
	public Float getPingjunzhi() {
		return pingjunzhi;
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
			
}
