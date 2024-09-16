package com.xworkz.provider.internal;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider {
	private int totalHalls;

	public BookMyShowMovieBookingProvider(String name, String ceoName, int totalHalls) {
		super(name, ceoName);
		this.totalHalls = totalHalls;
		System.out.println("Create const in BookMyShowMovieBookingProvider using int");
	}

	@Override
	public void book() {
		System.out.println("Running book in MovieBookingProvider");
	}

	@Override
	public void cancle() {
		System.out.println("Running cancle in MovieBookingProvider");
	}

	@Override
	public void service() {
		System.out.println("Running service in BookingProvider");
	}
	
	public void print()
	{
		System.out.println("TotalHalls:"+totalHalls);
	}
}
