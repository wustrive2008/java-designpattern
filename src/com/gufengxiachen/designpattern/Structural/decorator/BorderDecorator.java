package com.gufengxiachen.designpattern.Structural.decorator;


public class BorderDecorator extends Decorator{

	public BorderDecorator(VisualComponent component) {
		super(component);
	}

	 public void draw() {
        super.draw();
        drawBorder();
	}

    public void drawBorder() {
       System.out.println("加边框");
    }
}
