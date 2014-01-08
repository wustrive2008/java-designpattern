package com.gufengxiachen.designpattern.Creational.singleton;

public class Runtime {
	
	private static Runtime currentRuntime = new Runtime(); 

    public static Runtime getRuntime() { 
        return currentRuntime; 
    } 

   /** Don't let anyone else instantiate this class */ 
   private Runtime() {} 
}
