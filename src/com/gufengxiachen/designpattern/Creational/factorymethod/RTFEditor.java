package com.gufengxiachen.designpattern.Creational.factorymethod;

public class RTFEditor extends AbstractEditor{

	public IDocument createDocument() {
		// TODO Auto-generated method stub
		return new RTFDocument();
	}

}
