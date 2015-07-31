package com.gufengxiachen.designpattern.Creational.prototype;

import java.awt.Point;
import java.awt.Rectangle;

public class Application {
	
	 private AbstractFurniture circleTablePrototype;
	 private AbstractFurniture squaraTablePrototype;
	    
	    public void setCircleTablePrototype(
	                   AbstractFurniture circleTablePrototype) {
	        this.circleTablePrototype = circleTablePrototype;
	    }
	    
	    public synchronized void setSquaraTablePrototype(
				AbstractFurniture squaraTablePrototype) {
			this.squaraTablePrototype = squaraTablePrototype;
		}

		public void runAppExample() throws Exception {
	        House house = new House(); 
	        CircleTable circleTable = null;
	        SquareTable squaraTable = null;

	        // 从工具列选择一个家具加入房子中
	        circleTable =
	            (CircleTable) circleTablePrototype.clone();
	        circleTable.setCenter(new Point(10, 10));
	        house.addFurniture(circleTable); 
	        
	        // 从工具列选择一个家具加入房子中
	       /* circleTable = 
	            (CircleTable) circleTablePrototype.clone();
	        circleTable.setCenter(new Point(20, 30));
	        house.addFurniture(circleTable); */
	        
	        squaraTable = (SquareTable)squaraTablePrototype.clone();
	        squaraTable.setRectangle(new Rectangle(20,30));
	        house.addFurniture(squaraTable);
	    }
	    
	    public static void main(String[] args) throws Exception {
	        Application application = new Application();
	        application.setCircleTablePrototype(
	                            new CircleTable());
	        application.setSquaraTablePrototype(new SquareTable());
	        application.runAppExample();
	    }
}
