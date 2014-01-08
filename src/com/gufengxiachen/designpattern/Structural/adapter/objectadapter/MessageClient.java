package com.gufengxiachen.designpattern.Structural.adapter.objectadapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class MessageClient {
	private Enumeration iteratorAdapter;   
    public void run() {
        List arrayList = new ArrayList();

        for(int i = 0; i < 10; i++)
            arrayList.add("物件 " + i);
        
        iteratorAdapter = 
               new IteratorAdapter(arrayList.iterator());
        // We could still use MessageApplication
        MessageApplication msgApp = new MessageApplication();       
        msgApp.showAllMessage(iteratorAdapter);
    }

    public static void main(String[] args) {
        MessageClient msgClient = new MessageClient();
        msgClient.run();
    }
}
