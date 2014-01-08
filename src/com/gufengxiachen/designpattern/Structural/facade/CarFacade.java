package com.gufengxiachen.designpattern.Structural.facade;

public class CarFacade {
	Body body = new Body();
	 
    public void Run()
    {
        System.out.println(body.engine.enginWork());
        for(int i = 0; i < body.wheels.length; i++)
        {
            System.out.println(body.wheels[i].wheelCircumrotate());
        }
    }

    public void Stop()
    {
        System.out.println(body.engine.engineStop());
        for (int i = 0; i < body.wheels.length; i++)
        {
            System.out.println(body.wheels[i].wheelStop());
        }
    }
}
