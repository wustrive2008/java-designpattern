package com.gufengxiachen.designpattern.Creational.singleton;

public class SingletonSynchronized {
	 private static SingletonSynchronized instance = null;
	    private SingletonSynchronized(){}
	    synchronized static public SingletonSynchronized getInstance() {
	        if (instance == null) {
	            instance = new SingletonSynchronized();
	        }
	        return instance;
	    }
}
