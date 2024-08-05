class Rockets
{
String country;
double speed;
int fuelCapacity;
int noOfThrusters=50;

public Rockets(double speed)
{
this.speed=speed;
}

public void setFuelCapacity(int fuelCapacity)
{
this.fuelCapacity=fuelCapacity;
}

public void display()
{
	System.out.println("Rocket Country:"+country);
	System.out.println("Rocket speed:"+speed);
	System.out.println("Rocket fuelCapacity:"+fuelCapacity);
	System.out.println("Rocket noOfThrusters:"+noOfThrusters);
}
}

