package com.gufengxiachen.designpattern.Creational.abstractfactory;

public class MacWidgetFactory implements IWidgetFactory {

	public IButton getButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	public ITextField getITextField() {
		// TODO Auto-generated method stub
		return new MacTextField();
	}

}
