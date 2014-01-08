package com.gufengxiachen.designpattern.Behavioral.command;

public class UpperCaseHello implements ICommand{


	private String name;
	    
    public UpperCaseHello(String name) {
        this.name = name;    
    }


	public void execute() {
		 System.out.println("HELLO, " + name.toUpperCase());

	}

}
