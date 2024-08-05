class RocketsRunner
{
public static void main(String[] args)
{
Rockets rockets=new Rockets(7100.2);
rockets.setFuelCapacity(10000);
rockets.country="India";
rockets.display();

System.out.println("==============================");

Rockets rockets1=new Rockets(8100.2);
rockets1.setFuelCapacity(11000);
rockets1.country="America";
rockets1.display();

System.out.println("==============================");

Rockets rockets2=new Rockets(8200.2);
rockets2.setFuelCapacity(12000);
rockets2.country="UK";
rockets2.display();





}
}
