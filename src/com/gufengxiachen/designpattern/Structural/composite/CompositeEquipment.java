package com.gufengxiachen.designpattern.Structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeEquipment extends Equipment{

	private int i=0;
	
	private List equipment = new ArrayList();
	public CompositeEquipment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public boolean add(Equipment equipment){
		this.equipment.add(equipment);
		return true;
	}
	
	public double netPrice(){
		double netPrice = 0;
		Iterator iter = equipment.iterator();
		for (;iter.hasNext();) {
			netPrice += ((Equipment)iter.next()).netPrice();
		}
		return netPrice;
	}

	public double discountPrice() {
		// TODO Auto-generated method stub
		double discountPrice = 0 ;
		Iterator iter = equipment.iterator();
		for (;iter.hasNext();) {
			discountPrice += ((Equipment)iter.next()).discountPrice();
		}
		return discountPrice;
	}
	
	/*public Iterator iter(){
		return equipment.iterator();
	}
	
	public boolean hasNext(){return i<equipment.size();};
	
	public Object next(){
		if(hasNext()){
			return equipment.get(i++);
		}else{
			throw new NoSuchElementException();
		}
	}*/
	
	

}
