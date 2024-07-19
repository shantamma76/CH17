class Train{
public static void book(String source,String destination)
{
System.out.println("Parameter with two strings");
System.out.println("Source:" +source);
System.out.println("destination:" +destination);
}

public static void book(String source,String destination,int quantity)
{
System.out.println("Parameter with two strings,one int");
System.out.println("Soruce:" +source);
System.out.println("destination:" +destination);
System.out.println("Quantity:"+quantity);
}

public static void book(String source,String destination,int quantity,int price)
{
System.out.println("Parameter with two strings,two int");
System.out.println("Soruce:" +source);
System.out.println("destination:" +destination);
System.out.println("Quantity:"+quantity);
System.out.println("Price:"+price);
}


public static void cancle(int ticketNo)
{
System.out.println("passing int parameter with canceling ticket");
System.out.println("TicketNo:" +ticketNo);
}

public static void cancle(String source,String destination)
{
System.out.println("passing string parameters with canceling ticke");
System.out.println("Source:" +source);
System.out.println("Destination:" +destination);
}
}