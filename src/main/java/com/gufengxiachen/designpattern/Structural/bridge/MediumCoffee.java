package com.gufengxiachen.designpattern.Structural.bridge;

public class MediumCoffee extends Coffee{
	
	public MediumCoffee(){
		setCoffeeImp();
	}
	public void pourCoffee() {
	
		CoffeeImp coffeeImp = this.coffeeImp;
		for (int i = 0; i < 2; i++) {
			coffeeImp.pourCoffeeImp();
		}
	}
	
}
