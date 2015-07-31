package com.gufengxiachen.designpattern.Structural.adapter.objectadapter;

import java.util.Enumeration;

public class MessageApplication {
	 public void showAllMessage(Enumeration enum1) {
	        Object msg;
	        while(enum1.hasMoreElements()) { 
	            msg = enum1.nextElement();
	            System.out.println(msg);
	        }
	    }     
}
