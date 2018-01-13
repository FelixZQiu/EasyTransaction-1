package com.yiqiniu.easytrans.log.impl.database;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 数据库事务日志配置属性
* @author xudeyou 
*/
@ConfigurationProperties(prefix="easytrans.log.database")
public class DatabaseTransactionLogProperties {

	/**
	 * 是否能够清理日志
	 */
	private boolean logCleanEnabled = true;

	/**
	 * 储备日志天数
	 */
	private int logReservedDays = 14;

	/**
	 * 日志清理时间
	 */
	private String logCleanTime = "01:20:00";

	/**
	 * 是否已经启用
	 */
	private Boolean enabled;
	
	private Map<String,String> druid;

	public Map<String, String> getDruid() {
		return druid;
	}

	public void setDruid(Map<String, String> druid) {
		this.druid = druid;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public int getLogReservedDays() {
		return logReservedDays;
	}

	public void setLogReservedDays(int logReservedDays) {
		this.logReservedDays = logReservedDays;
	}

	public String getLogCleanTime() {
		return logCleanTime;
	}

	public void setLogCleanTime(String logCleanTime) {
		this.logCleanTime = logCleanTime;
	}

	public boolean isLogCleanEnabled() {
		return logCleanEnabled;
	}

	public void setLogCleanEnabled(boolean logCleanEnabled) {
		this.logCleanEnabled = logCleanEnabled;
	}

}
