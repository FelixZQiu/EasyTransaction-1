package com.yiqiniu.easytrans.datasource;

import com.yiqiniu.easytrans.protocol.EasyTransRequest;
import com.yiqiniu.easytrans.protocol.TransactionId;

/**
 * 事务状态日志接口
 */
public interface TransStatusLogger {

	/**
	 * 事务状态
	 */
	public static class TransactionStatus{
		/**
		 * 已提交
		 */
		public static final int COMMITTED = 0;
		/**
		 * 已回滚
		 */
		public static final int ROLLBACKED = 1;
		/**
		 * 未知
		 */
		public static final int UNKNOWN = 2;
	}
	
	
	/**
	 * 检查master事务状态
	 * check the master transaction status,the default implement is
	 * <ul>
	 * <li>if business committed  the record write in recordStatus() will be found in the database</li>
	 * <li>if business roll back the record write in recordStatus() can not be found in the database</li>
	 * </ul>
	 * @param appId
	 * @param trxId
	 * @return null for processing/unknown,false for roll back,true for committed  
	 */
	Boolean checkTransactionStatus(String appId,String busCode,String trxId);
	
	/**
	 * RPC执行之前调用，帮助checkStatus()表明一个业务事务的最终状态
	 * invoke before RPC is executed,to help checkStatus() indicate the final status of a business transaction
	 * @param appId
	 * @param busCode 业务码
	 * @param trxId   事务id
	 */
	void writeExecuteFlag(String appId, String busCode, String trxId, String pAppId, String pBusCode, String pTrxId,
			int status);

	/**
	 * 
	 * @param pId
	 * @param request
	 * @param status
	 */
	void updateExecuteFlagForSlaveTrx(TransactionId pId, EasyTransRequest<?, ?> request, int status);
}
