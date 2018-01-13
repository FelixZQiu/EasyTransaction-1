package com.yiqiniu.easytrans.protocol;

import com.yiqiniu.easytrans.datasource.TransStatusLogger.TransactionStatus;
import com.yiqiniu.easytrans.protocol.annotation.ExecuteOrder;
import com.yiqiniu.easytrans.protocol.annotation.MethodTransactionStatus;
import com.yiqiniu.easytrans.queue.consumer.EasyTransConsumeAction;


public interface MessageBusinessProvider<P extends EasyTransRequest<?, ?>> extends BusinessProvider<P> {


	/**
	 * 表明isSynchronousMethod()为true的话，去保存返回值
	 * indicate isSynchronousMethod to be true,to save the return value
	 * @param request
	 * @return
	 */
	@ExecuteOrder(doNotExecuteAfter = {}, ifNotExecutedReturnDirectly = {}, isSynchronousMethod=true)
	@MethodTransactionStatus(TransactionStatus.COMMITTED)
	public EasyTransConsumeAction consume(EasyTransRequest<?, ?> request);
}
