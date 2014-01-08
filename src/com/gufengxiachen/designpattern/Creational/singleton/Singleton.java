package com.gufengxiachen.designpattern.Creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
	  private static Map registry = new HashMap(); 
	    private static Singleton instance;

	    public static void register(
	                 String name, Singleton singleton) {
	        registry.put(name, singleton);
	    }

	    public static Singleton getInstance(String name) {
	        if (instance == null) {
	           
	            instance = lookup(name);
	        }

	        return instance;
	    }

	    protected static Singleton lookup(String name) {
	        return (Singleton) registry.get(name);
	    }
}
