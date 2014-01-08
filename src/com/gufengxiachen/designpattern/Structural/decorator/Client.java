package com.gufengxiachen.designpattern.Structural.decorator;

public class Client {
	
	public static void main(String[] args) {
		
		BorderDecorator borderDecorator =
	         new BorderDecorator(
	               new ScrollDecorator(new TextView()));
		borderDecorator.draw();
		
	}
}
