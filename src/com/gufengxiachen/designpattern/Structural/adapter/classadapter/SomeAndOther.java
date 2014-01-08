package com.gufengxiachen.designpattern.Structural.adapter.classadapter;

public class SomeAndOther extends SomeClass implements IOther{
	private IOther other = new OtherClass();
	
	public void doOther() {
		other.doOther();
	}

}
