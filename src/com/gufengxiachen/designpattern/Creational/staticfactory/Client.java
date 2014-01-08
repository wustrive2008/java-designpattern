package com.gufengxiachen.designpattern.Creational.staticfactory;

public class Client {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//带上包名
		playMusicBox(MusicBoxFactory.createMusicBox("com.gufengxiachen.designpattern.Creational.staticfactory.PianoBox"));
		playMusicBox(MusicBoxFactory.createMusicBox("com.gufengxiachen.designpattern.Creational.staticfactory.ViolinBox"));
	}
	
	public static void playMusicBox(IMusicBox musicBox){
		musicBox.play();
	}

}
