package com.gufengxiachen.designpattern.Structural.facade;

public class Body {
	public Wheel[] wheels = new Wheel[4];
    public Engine engine = new Engine();
    public Body()
    {
        for (int i = 0; i < wheels.length; i++)
        {
            wheels[i] = new Wheel();
        }
    }
}
