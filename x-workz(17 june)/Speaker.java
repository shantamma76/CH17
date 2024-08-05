//05-08-2024

class Speaker
{
String brand;
String size;
double cost;
String output="sounda";

public Speaker(String size)
{
this.size=size;
}

public void setCost(double cost)
{
this.cost=cost;
}

public void display()
{
	System.out.println("Speaker Brand:"+brand);
	System.out.println("Speaker size:"+size);
    System.out.println("Speaker cost:"+cost);
    System.out.println("Speaker Output:"+output);
}
}

