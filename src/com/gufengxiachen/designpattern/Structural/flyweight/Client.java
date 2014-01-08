package com.gufengxiachen.designpattern.Structural.flyweight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory(); 
		Flyweight fly1 = factory.getFlyweight( "Fred" ); 
		Flyweight fly2 = factory.getFlyweight( "Wilma" );
		fly1.operation(1);
		fly2.operation(2);
		
	}
}
