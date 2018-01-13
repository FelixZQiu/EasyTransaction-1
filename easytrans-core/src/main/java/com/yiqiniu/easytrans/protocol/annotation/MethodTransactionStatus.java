package com.yiqiniu.easytrans.protocol.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 事务状态值
 * TransStatusLogger.TransactionStatus
 */
@Target({METHOD})
@Retention(RUNTIME)
public @interface MethodTransactionStatus {
	
	/**
	 * value of com.yiqiniu.easytrans.datasource.TransStatusLogger.TransactionStatus
	 * 默认值-1是无效的，如果保持默认值不变化，在之后的处理中将会得到错误
	 * the default value -1 is invalid,keep the default value unchange will get an error in later processing
	 * @return
	 */
	int value() default -1;
	
}
