package com.yiqiniu.easytrans.master;

import java.util.concurrent.TimeUnit;

/**
 * master选择器
 */
public interface EasyTransMasterSelector {
	
	/**
	 * whether this job has the leadership
	 * @return
	 */
	boolean hasLeaderShip();

	/**
	 * wait till taken LeaderShip or closed.
	 * it should used cooperate with hasLeaderShip
	 * @throws InterruptedException
	 */
	public void await() throws InterruptedException;
	
	/**
	 * 导致当前线程去阻塞直到这个实例获取到领导权，除非线程被中断、指定的等待时间流逝、或者实例被关闭
	 * Causes the current thread to wait until this instance acquires leadership unless
	 * the thread is interrupted, the specified waiting time elapses or the instance is closed.
	 * @param timeout
	 * @param unit
	 * @return
	 * @throws InterruptedException
	 */
	public boolean await(long timeout, TimeUnit unit) throws InterruptedException;
}
