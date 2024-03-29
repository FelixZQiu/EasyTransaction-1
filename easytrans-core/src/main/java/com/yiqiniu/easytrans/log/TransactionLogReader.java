package com.yiqiniu.easytrans.log;

import java.util.Date;
import java.util.List;

import com.yiqiniu.easytrans.log.vo.LogCollection;

public interface TransactionLogReader {

	/**
	 * 获取未完成的日志记录
	 * get unfinished logs
	 * @param locationId can be null
	 * @param pageSize
	 * @param createTimeFloor
	 * @return
	 */
	List<LogCollection> getUnfinishedLogs(LogCollection locationId,int pageSize,Date createTimeFloor);
}
