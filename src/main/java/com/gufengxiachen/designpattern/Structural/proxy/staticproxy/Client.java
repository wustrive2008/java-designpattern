package com.gufengxiachen.designpattern.Structural.proxy.staticproxy;

public class Client {
	public static void main(String[] args) {
		IHello helloProxy = new HelloProxy(new HelloSpeaker()); 
		helloProxy.hello("Justin");
	}

}
