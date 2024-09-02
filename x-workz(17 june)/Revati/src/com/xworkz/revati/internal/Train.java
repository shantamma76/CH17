package com.xworkz.revati.internal;

public class Train {

	private int no;
	private String source;
	private String destination;

	public Train(int no, String source) {
		this.no = no;
		this.source = source;
		System.out.println("Running int,string const in Train..");
	}

	public Train(int no, String source, String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination = destination;
		System.out.println("Running int,string,string const in Train.");
	}

	public void display() {
		System.out.println("Display from display");
		System.out.println("No:" + no);
		System.out.println("source:" + source);
		System.out.println("Destination:" + destination);
	}

}





