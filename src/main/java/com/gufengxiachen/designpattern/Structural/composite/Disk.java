package com.gufengxiachen.designpattern.Structural.composite;

public class Disk extends Equipment{

	public Disk(String name) {
		super(name);
		
	}

	public double discountPrice() {
		return 0.5;
	}

	public double netPrice() {
		return 1;
	}

}
