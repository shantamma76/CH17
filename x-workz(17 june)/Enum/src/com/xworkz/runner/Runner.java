package com.xworkz.runner;

import com.xworkz.constants.ProductType;
import com.xworkz.constants.SeatType;
import com.xworkz.constants.TicketType;
import com.xworkz.dto.CustomerDTO;
import com.xworkz.dto.TicketBookDTO;

public class Runner {

	public static void main(String[] args) {

		CustomerDTO customerDTO = new CustomerDTO("shanta", "shanta@gmail.com", ProductType.KITCHEN);
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getProductType());

		System.out.println("==============================================");

		TicketBookDTO ticketBookDTO = new TicketBookDTO("KGF", "PVR", TicketType.ONLINE, SeatType.EXECUTIVE);

		System.out.println(ticketBookDTO.getMovieName());
		System.out.println(ticketBookDTO.getTheaterName());
		System.out.println(ticketBookDTO.getTicketType().getCost());
		System.out.println(ticketBookDTO.getSeatType().getSeatNo());

	}

}
