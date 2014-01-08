package com.gufengxiachen.designpattern.Creational.abstractfactory;

public class CustomDialog {
	private IButton button;
	private ITextField textField;
	
	public CustomDialog(IWidgetFactory widgetFactory){
		setWidgetFactory(widgetFactory);
	}

	public void setWidgetFactory(IWidgetFactory widgetFactory){
		setButton(widgetFactory.getButton());
		setTextField(widgetFactory.getITextField());
	}
	public  void setButton(IButton button) {
		this.button = button;
	}

	public  void setTextField(ITextField textField) {
		this.textField = textField;
	}
	
	
	public void layoutAllComponents(){
		
	}
	
	public void showDialog(){
		this.paintDialog();
		button.paintButton();
		textField.paintTextField();
	}
	
	
	public void paintDialog(){
		System.out.println("custom dialog paints...");
	}
}
