package com.jeecg.p3.jiugongge.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActJiugonggePrizes:配置<br>
 * @author junfeng.zhou
 * @since：2015年11月16日 11时07分12秒 星期一 
 * @version:1.0
 */
public class WxActJiugonggePrizes implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	private String jwidName;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 *奖项名称
	 */
	private String awardsName;
	public String getAwardsName() {
		return awardsName;
	}
	public void setAwardsName(String awardsName) {
		this.awardsName = awardsName;
	}
	/**
	 *数量
	 */
	private Integer amount;
	/**
	 *剩余数量
	 */
	private Integer remainNum;
	/**
	 *概率
	 */
	private Double probability;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Double getProbability() {
		return probability;
	}
	public void setProbability(Double probability) {
		this.probability = probability;
	}
	/**
	 *
	 */
	private Integer awardsValue;
	public Integer getAwardsValue() {
		return awardsValue;
	}
	public void setAwardsValue(Integer awardsValue) {
		this.awardsValue = awardsValue;
	}
	/**
	 *
	 */
	private String awardId;
	public String getAwardId() {
		return awardId;
	}
	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	public Integer getRemainNum() {
		return remainNum;
	}
	public void setRemainNum(Integer remainNum) {
		this.remainNum = remainNum;
	}
	
	
}
