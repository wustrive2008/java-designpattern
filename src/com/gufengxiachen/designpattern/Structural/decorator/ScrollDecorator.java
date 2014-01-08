package com.gufengxiachen.designpattern.Structural.decorator;

public class ScrollDecorator extends Decorator{

	public ScrollDecorator(VisualComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
        super.draw();
        scrollTo();
	}

    public void scrollTo() {
       System.out.println("加滚动");
    }

}
