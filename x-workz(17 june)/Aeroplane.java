// 31/07/2024 Multiple Constructor Declarations

class Aeroplane
{
String company;
int noOfSeats;
double ticketPrice;
String source;
String destination;

Aeroplane()
{
System.out.println("No Parameter Constructor");
}


Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
{
System.out.println("Initialing all instance variables");
this.company=company;
this.noOfSeats=noOfSeats;
this.ticketPrice=ticketPrice;
this.source=source;
this.destination=destination;
}

Aeroplane(String company,String source,String destination)
{
System.out.println("initialing company,source,destination");
this.company=company;
this.source=source;
this.destination=destination;
}

Aeroplane(String company,double ticketPrice,String source,String destination)
{
System.out.println("initialing company,ticketPrice,source,destination");
this.company=company;
this.ticketPrice=ticketPrice;
this.source=source;
this.destination=destination;
}
}