package com.yiqiniu.easytrans.log.impl.database;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据库事务日志详情
 */
public class DataBaseTransactionLogDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志详情id
	 */
	private Integer logDetailId;
	/**
	 * 事务日志id
	 */
	private String transLogId;
	/**
	 * 日志详情
	 */
	private byte[] logDetail;
	/**
	 * 创建时间
	 */
	private Date createTime;

	public Integer getLogDetailId() {
		return logDetailId;
	}
	public void setLogDetailId(Integer logDetailId) {
		this.logDetailId = logDetailId;
	}
	public String getTransLogId() {
		return transLogId;
	}
	public void setTransLogId(String transLogId) {
		this.transLogId = transLogId;
	}

	public byte[] getLogDetail() {
		return logDetail;
	}

	public void setLogDetail(byte[] logDetail) {
		this.logDetail = logDetail;
	}

	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
