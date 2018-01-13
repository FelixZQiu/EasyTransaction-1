package com.yiqiniu.easytrans.filter;

import java.util.List;

public interface EasyTransFilterChainFactory {
	
	/**
	 * RPC、队列实现应该包装用户业务代码到一个过滤器，然后添加到过滤器链的末端
	 * 因此执行用户业务代码前，我们将会过滤这个请求
	 * get default filter chain<br/>
	 * RPC,Queue Implement should wrap the user business code to a filter,and then add to the chain end<br/>
	 * so before execute the user business code,we filter the request
	 * @param appId
	 * @param busCode  业务代码
	 * @param innerMethod
	 * @return
	 */
	EasyTransFilterChain getDefaultFilterChain(String appId,String busCode,String innerMethod);
	
	EasyTransFilterChain getFilterChainByFilters(String appId,String busCode,String innerMethod,List<EasyTransFilter> filters);
	
	List<EasyTransFilter> getDefaultFilters();
}
