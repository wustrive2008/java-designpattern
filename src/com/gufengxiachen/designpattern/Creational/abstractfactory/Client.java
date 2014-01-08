package com.gufengxiachen.designpattern.Creational.abstractfactory;

public class Client {
	
	public static void main(String[] args) {
		CustomDialog windowsDialog = 
		      new CustomDialog(new WindowsWidgetFactory());
		windowsDialog.showDialog();
		                
		CustomDialog macDialog = 
		      new CustomDialog(new MacWidgetFactory());
		macDialog.showDialog();
	}

}
