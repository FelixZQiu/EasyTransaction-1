package com.yiqiniu.easytrans.protocol.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 定义方法执行顺序
 *	define the execute order of methods
 */
@Target({METHOD})
@Retention(RUNTIME)
public @interface ExecuteOrder {
	
	/**
	 * 在被调用的方法列表中的一个方法之后不执行方法，
	 * 典型用于TCC事务，
	 * 如果cancel-method被执行，那后面的try-method不应该执行
	 * do not execute method after one of the methods in the list called
	 * typical used in TCC, if cancel-method executed,then latter try-method should not be execute
	 */
	String[] doNotExecuteAfter();
	
	/**
	 * 如果方法列表中的一个方法被执行，那么执行返回没有执行业务实现
	 * 典型用于可补偿业务，如果doCompensableBusiness不工作，那么调用doCompensation不应该执行业务代码，
	 * 而是直接返回
	 * if the one of the methods executed,then return directly without execute business implement<br/>
	 * typical used in CompensableBusiness, if doCompensableBusiness did not work,<br>
	 * then call doCompensation should not execute business codes,just return directly
	 */
	String[] ifNotExecutedReturnDirectly();
	
	/**
	 * 是否是业务同步方法，比如：TCC的Try方法是同步方法
	 * whether is the synchronizer method for business<br/>
	 * For example,TCC's Try method is synchronizer method 
	 */
	boolean isSynchronousMethod() default false;
}
