// 31/07/2024 Multiple Constructor Declarations

class AeroplaneRunner
{
public static void main(String[] args)
{
Aeroplane aeroplane=new Aeroplane();
System.out.println("Company:"+aeroplane.company);
System.out.println("noOfSeats:"+aeroplane.noOfSeats);
System.out.println("ticketPrice:"+aeroplane.ticketPrice);
System.out.println("source:"+aeroplane.source);
System.out.println("destination:"+aeroplane.destination);
	

Aeroplane aeroplane1=new Aeroplane("HP",80,50.2,"Kalaburgi","Bangalore");
System.out.println("Company:"+aeroplane1.company);
System.out.println("noOfSeats:"+aeroplane1.noOfSeats);
System.out.println("ticketPrice:"+aeroplane1.ticketPrice);
System.out.println("source:"+aeroplane1.source);
System.out.println("destination:"+aeroplane1.destination);

Aeroplane aeroplane2=new Aeroplane("Lenova","Bangalore","Gulbarga");
System.out.println("Company:"+aeroplane2.company);
System.out.println("source:"+aeroplane2.source);
System.out.println("destination:"+aeroplane2.destination);

Aeroplane aeroplane3=new Aeroplane("Victus",92.3,"Bijapur","Bangalore");
System.out.println("Company:"+aeroplane3.company);
System.out.println("ticketPrice:"+aeroplane3.ticketPrice);
System.out.println("source:"+aeroplane3.source);
System.out.println("destination:"+aeroplane3.destination);
}
}
