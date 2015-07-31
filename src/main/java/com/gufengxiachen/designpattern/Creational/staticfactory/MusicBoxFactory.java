package com.gufengxiachen.designpattern.Creational.staticfactory;

/**
 * 静态工厂，动态生成类实例
 * @author wustrive_2008
 * @date   2013-3-9
 * @time   上午09:34:55
 * @version 
 * @tags
 */
public class MusicBoxFactory {
	

	/**
	 * 使用java反射机制构建类对象
	 * name:类的全名(包括包名)
	 */
	public static IMusicBox createMusicBox(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		
		return (IMusicBox)Class.forName(name).newInstance();
	}

}
