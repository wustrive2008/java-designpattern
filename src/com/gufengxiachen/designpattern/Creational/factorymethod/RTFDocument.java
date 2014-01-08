package com.gufengxiachen.designpattern.Creational.factorymethod;

public class RTFDocument implements IDocument{

	public RTFDocument() { 
        System.out.println("建立RTF文件"); 
    }
	
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭文件");
	}

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开启文件");
	}

	public void save() {
		// TODO Auto-generated method stub
		System.out.println("存储文件");
	}

}
