package com.gufengxiachen.designpattern.Creational.builder;

public class Client {
	public static void main(String[] args) {
		int[][] maze = {{1, 1, 1, 1, 1, 1, 1}, 
                {1, 0, 0, 0, 0, 2, 1}, 
                {1, 0, 1, 0, 1, 0, 1}, 
                {1, 0, 2, 1, 0, 1, 1}, 
                {1, 1, 0, 1, 0, 1, 1}, 
                {1, 0, 0, 2, 0, 0, 1}, 
                {1, 1, 1, 1, 1, 1, 1}};
		MazeDirector mazeDirector = new MazeDirector();
		mazeDirector.setMaze(maze);
		
		System.out.println("Build SolidMaze....");
        mazeDirector.setMazeBuilder(new SolidMazeBuilder());
        mazeDirector.buildMaze();
        
        System.out.println("Build DiamondMaze....");
        
        mazeDirector.setMazeBuilder(
                       new DiamondMazeBuilder());
        mazeDirector.buildMaze();
	}

}
