package com.gufengxiachen.designpattern.Structural.facade;

public class Client {
	public static void main(String[] args) {
		CarFacade car = new CarFacade();
        car.Run();
        car.Stop();
        
	}
}
