package com.gufengxiachen.designpattern.Structural.bridge;

public class Client {
	
	public static void main(String[] args) {
		
		new CoffeeImpSingleton(new MilkCoffeeImp());

		//中杯加奶
		MediumCoffee mediumCoffee = new MediumCoffee();
		mediumCoffee.pourCoffee();
		
		
		new CoffeeImpSingleton(new FragrantCoffeeImp());
		//大杯原味
		SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
		superSizeCoffee.pourCoffee();
	}

}
