package com.jeecg.p3.commonftb.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActCommonsjRegistration:砍价报名表<br>
 * @author pituo
 * @since：2015年11月30日 15时51分48秒 星期一 
 * @version:1.0
 */
public class WxActCommonftbRegistration implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 *卡券密码
	 */
	private String cardPsd;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getCardPsd() {
		return cardPsd;
	}
	public void setCardPsd(String cardPsd) {
		this.cardPsd = cardPsd;
	}
	
	
}
