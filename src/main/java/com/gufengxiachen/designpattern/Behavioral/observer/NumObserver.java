package com.gufengxiachen.designpattern.Behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class NumObserver implements Observer{

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		NumObservable myObserable=(NumObservable) o;
	       System.out.println("Data has changed to " +myObserable.getData());
	}

}
