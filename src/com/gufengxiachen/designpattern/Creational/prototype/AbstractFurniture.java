package com.gufengxiachen.designpattern.Creational.prototype;

public abstract class AbstractFurniture implements Cloneable {
	
	public abstract void draw();
	
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
}
