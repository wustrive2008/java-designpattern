package com.gufengxiachen.designpattern.Structural.composite;

public class Cabinet extends CompositeEquipment{

	public Cabinet(String name) {
		super(name);
	}
	public double netPrice(){
		return 1+super.netPrice();
	}

	public double discountPrice(){
		return 0.5+super.discountPrice();
	}
}
