package org.colorcoding.ibas.businesspartner;

/**
 * 我的配置项
 */
public class MyConfiguration extends org.colorcoding.ibas.bobas.MyConfiguration {

	/**
	 * 模块标识
	 */
	public static final String MODULE_ID = "2bd803fd-975c-4f7c-aa41-1ca2991cc126";

	/**
	 * 命名空间
	 */
	public static final String NAMESPACE_ROOT = "http://colorcoding.org/ibas/businesspartner/";

	/**
	 * 数据命名空间
	 */
	public static final String NAMESPACE_DATA = NAMESPACE_ROOT + "data";

	/**
	 * 业务对象命名空间
	 */
	public static final String NAMESPACE_BO = NAMESPACE_ROOT + "bo";

	/**
	 * 服务命名空间
	 */
	public static final String NAMESPACE_SERVICE = NAMESPACE_ROOT + "service";
	/**
	 * 配置项目-文件文件夹
	 */
	public final static String CONFIG_ITEM_BUSINESSPARTNER_FILE_FOLDER = "BPFileFolder";

}
