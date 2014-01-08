package com.gufengxiachen.designpattern.Behavioral.chainofresponsibility;

public class ConcreteHandler extends Handler{

	public void handleRequest() {
		// TODO Auto-generated method stub
		if(getSuccessor() != null)
        {            
            System.out.println("放过请求");
            getSuccessor().handleRequest();            
        }else
        {            
            System.out.println("处理请求");
        }
	}

}
