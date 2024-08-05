class Chocolate
{
String brand;
double price;
String flavour;
String size="small";


public Chocolate(double price)
{
this.price=price;
}

public void setFlavour(String flavour)
{
this.flavour=flavour;
}

public void display()
{
	System.out.println("chocolate brand:"+brand);
	System.out.println("chocolate price:"+price);
	System.out.println("chocolate flavour:"+flavour);
	System.out.println("chocolate size:"+size);

}
}





