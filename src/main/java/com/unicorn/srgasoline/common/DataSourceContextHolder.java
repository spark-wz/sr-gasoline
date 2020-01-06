package com.unicorn.srgasoline.common;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:16
 */
public class DataSourceContextHolder {

	/**

	 * 默认数据源

	 */

	public static final String MYSQL = "mysql";

	public static final String SQLSERVER_1 = "sqlServer1";
	public static final String SQLSERVER_2 = "sqlServer2";



	private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();



	// 设置数据源名

	public static void setDB(String dbType) {

		System.out.println("切换到{"+dbType+"}数据源");

		contextHolder.set(dbType);

	}



	// 获取数据源名

	public static String getDB() {

		return (contextHolder.get());

	}



	// 清除数据源名

	public static void clearDB() {

		contextHolder.remove();

	}

}
