package com.gufengxiachen.designpattern.Creational.abstractfactory;

public class WindowsWidgetFactory implements IWidgetFactory{

	public IButton getButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	public ITextField getITextField() {
		// TODO Auto-generated method stub
		return new WindowsTextField();
	}
	

}
