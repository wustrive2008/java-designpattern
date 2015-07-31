package com.gufengxiachen.designpattern.Structural.adapter.defaultadapter;

import java.awt.event.WindowEvent;

public abstract class WindowAdapter implements WindowListener{
	 	public void windowOpened(WindowEvent e) {}
	    public void windowClosing(WindowEvent e) {}
	    public void windowClosed(WindowEvent e) {}
	    public void windowIconified(WindowEvent e) {}
	    public void windowDeiconified(WindowEvent e) {}
	    public void windowActivated(WindowEvent e) {}
	    public void windowDecativated(WindowEvent e) {}
}
