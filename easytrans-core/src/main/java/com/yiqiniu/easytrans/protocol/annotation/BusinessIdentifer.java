package com.yiqiniu.easytrans.protocol.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 业务标识符，应该被添加到每一个具体的业务请求实现中
 * this should add to every concrete EasyTransRequest implement
 */
@Target({ TYPE })
@Retention(RUNTIME)
public @interface BusinessIdentifer {
	/**
	 * 通过appId找到相应的模块
	 * find module by appId
	 */
	String appId();
	/**
	 * 通过业务码找到模块中的服务
	 * find service in module by busCode
	 * @return
	 */
	String busCode();
	/**
	 * Rp调用超时时间(毫秒)，默认是0
	 * RPC call timeout(milliseconds). 0 for default setting
	 * @return
	 */
	int rpcTimeOut() default 0;
}
