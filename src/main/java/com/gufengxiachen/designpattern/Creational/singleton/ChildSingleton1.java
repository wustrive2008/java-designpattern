package com.gufengxiachen.designpattern.Creational.singleton;

public class ChildSingleton1 extends Singleton{
	public ChildSingleton1() {
        // ....
        // 注册子类别物件
        register(getClass().getName(), this);  
    }
	
	public static void main(String[] args) {
		new ChildSingleton1();
		Singleton childSingleton = Singleton.getInstance("com.gufengxiachen.designpattern.Creational.singleton.ChildSingleton1");
	}
}
