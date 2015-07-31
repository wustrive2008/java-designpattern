package com.gufengxiachen.designpattern.Creational.builder;

public class DiamondMazeBuilder implements IMazeBuilder {

	public void createRoadBlock() {
		// TODO Auto-generated method stub
		System.out.print(" ");
	}

	public void createTreasureBlock() {
		// TODO Auto-generated method stub
		System.out.print("* ");
	}

	public void createWallBlock() {
		// TODO Auto-generated method stub
		System.out.print("<>");
	}

	public void newRow() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
