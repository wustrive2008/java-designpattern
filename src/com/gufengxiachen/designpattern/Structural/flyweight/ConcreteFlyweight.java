package com.gufengxiachen.designpattern.Structural.flyweight;

public class ConcreteFlyweight implements Flyweight{
	private String intrinsicstate = "A";
	
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub
		System.out.println("intrinsicstate:"+intrinsicstate+",extrinsicState:"+extrinsicState);
	}

}
