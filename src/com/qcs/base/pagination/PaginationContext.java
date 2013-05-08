package com.qcs.base.pagination;

public class PaginationContext {

	private static ThreadLocal paginationInfo = new ThreadLocal();

	public static Object get() {
		return paginationInfo.get();
	}

	public static void set(PaginationInfo pageInfo) {
		PaginationContext.paginationInfo.set(pageInfo);
	}
	
	public static Object remove(){
		Object obj = paginationInfo.get();
		paginationInfo.remove();
		return obj;
	}
	
}
