package com.gufengxiachen.designpattern.Structural.adapter.defaultadapter;

import java.awt.event.WindowEvent;

public class WindowEventHandler extends WindowAdapter{
	
	  public void windowClosed(WindowEvent e) {
	        System.exit(0);
	  }

}
