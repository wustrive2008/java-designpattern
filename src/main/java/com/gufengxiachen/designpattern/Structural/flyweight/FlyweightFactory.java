package com.gufengxiachen.designpattern.Structural.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable(); 

	public Flyweight getFlyweight( Object key ) { 

		Flyweight flyweight = (Flyweight) flyweights.get(key); 
	
		if( flyweight == null ) {
		//产生新的ConcreteFlyweight
		flyweight = new ConcreteFlyweight(); 
		flyweights.put( key, flyweight ); 
		} 
	
		return flyweight; 
	} 

}
