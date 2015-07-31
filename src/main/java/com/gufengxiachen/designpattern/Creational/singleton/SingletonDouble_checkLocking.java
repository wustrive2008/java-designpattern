package com.gufengxiachen.designpattern.Creational.singleton;

public class SingletonDouble_checkLocking {
	  private static SingletonDouble_checkLocking instance = null;
	    private SingletonDouble_checkLocking(){}
	    public static SingletonDouble_checkLocking getInstance() {
	        if (instance == null){
	            synchronized(SingletonDouble_checkLocking.class){
	                if(instance == null) {
	                     instance = new SingletonDouble_checkLocking();
	                }
	            }
	        }
	        return instance;
	    }
}
