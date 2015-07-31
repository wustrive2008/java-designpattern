package com.gufengxiachen.designpattern.Structural.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		
		LogHandler logHandler = new LogHandler(); 
		
		IHello helloProxy = (IHello) logHandler.bind(new HelloSpeaker()); 
		
		helloProxy.hello("Justin");
	}

}
