package com.xworkz.practise.internal;

public class Board {
	
	private String color;
	private int cost;
	
	public Board()
	{
		System.out.println("creating board using no-arg const");
	}

	public Board(String color,int cost)
	{
		this.color=color;
		this.cost=cost;
		System.out.println("Running string,int in board");
	}
	
	public void display()
	{
		System.out.println("Running display in board");
		System.out.println("Color:"+color);
		System.out.println("Cost:"+cost);
	}
}
