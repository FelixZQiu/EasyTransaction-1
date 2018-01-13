package com.yiqiniu.easytrans.protocol;

/**
 * 业务提供者
 * @param <P>
 */
public interface BusinessProvider<P extends EasyTransRequest<?, ?>>{
	
	/**
	 * 幂等被框架代码实现
	 * 这将要榨取性能成本，但它有助于降低业务的复杂性
	 * Idempotent implement by Framework code<br/>
	 * this will take extract performance cost,but it will help decrease the complexity of business<br/>
	 */
	public static final int IDENPOTENT_TYPE_FRAMEWORK = 0;
	
	/**
	 * 幂等被业务代码实现
	 * 这将会榨取业务开发中的成本，但它有助于提高性能
	 * Idempotent implement by Business code<br/>
	 * this will take extract develop cost in business,but it will help increase the performance
	 */
	public static final int IDENPOTENT_TYPE_BUSINESS = 1;
	
	/**
	 * 幂等类型声明
	 * idempotent type declare. 
	 * IDENPOTENT_TYPE_FRAMEWORK = 0
	 * IDENPOTENT_TYPE_BUSINESS = 1
	 * @return
	 */
	int getIdempotentType();

}
