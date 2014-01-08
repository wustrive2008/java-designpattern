package com.gufengxiachen.designpattern.Behavioral.mediator;

public class ColleagueB extends AbstractColleague{
	
      
    public void self() {  
        System.out.println("同事B --> 做好自己分内的事情 ...");  
    }  
      
    public void out() {  
        System.out.println("同事B --> 请求同事A做好分内工作  ...");  
        super.mediator.execute("ColleagueA", "self");  
    }  
}
