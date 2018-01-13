package com.yiqiniu.easytrans.log.vo;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 表明日志是在提交以后写成的
 *	indicate the log is written after commit
 */
@Target({TYPE})
@Retention(RUNTIME)
public @interface AfterCommit {
	
}
