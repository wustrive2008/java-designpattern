package com.gufengxiachen.designpattern.Creational.factorymethod;

public class Client {
	public static void main(String[] args) {
		AbstractEditor editor = new RTFEditor();
		IDocument document = editor.createDocument();
		document.open();
		document.save();
		document.close();
	}

}
