package com.gufengxiachen.designpattern.Structural.bridge;

public class SuperSizeCoffee extends Coffee{

	public SuperSizeCoffee(){
		setCoffeeImp();
	}
	public void pourCoffee() {
		// TODO Auto-generated method stub
		CoffeeImp coffeeImp = this.coffeeImp;
		for (int i = 0; i < 5; i++) {
			coffeeImp.pourCoffeeImp();
		}
	}

}
