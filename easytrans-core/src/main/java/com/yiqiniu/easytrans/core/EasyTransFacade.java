package com.yiqiniu.easytrans.core;

import java.io.Serializable;
import java.util.concurrent.Future;

import com.yiqiniu.easytrans.executor.EasyTransExecutor;
import com.yiqiniu.easytrans.protocol.EasyTransRequest;

public interface EasyTransFacade {

	/**
	 * 开启事务
	 * @param busCode
	 * @param trxId
	 */
	public void startEasyTrans(String busCode,String trxId);

	/**
	 * 执行事务
	 * @param params
	 * @param <P>
	 * @param <E>
	 * @param <R>
	 * @return
	 */
	public <P extends EasyTransRequest<R,E>,E extends EasyTransExecutor, R extends Serializable> Future<R> execute(P params);
}
