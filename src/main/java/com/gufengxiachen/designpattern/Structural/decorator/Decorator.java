package com.gufengxiachen.designpattern.Structural.decorator;

public abstract class Decorator implements VisualComponent {
	protected VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    public void draw() {
        component.draw();
    }
	
}
