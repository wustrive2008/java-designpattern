package com.gufengxiachen.designpattern.Creational.builder;

public interface IMazeBuilder {
	public void createRoadBlock();
	public void createWallBlock();
	public void createTreasureBlock();
	public void newRow();
}
