class ChocolateRunner
{
public static void main(String[]  args)
{
Chocolate chocolate=new Chocolate(40);
chocolate.setFlavour("Venilla");
chocolate.brand="dairy milk";
chocolate.display();

System.out.println("==============================");

Chocolate chocolate1=new Chocolate(45);
chocolate1.setFlavour("choco");
chocolate1.brand="Fuese";
chocolate1.display();

System.out.println("==============================");

Chocolate chocolate2=new Chocolate(175);
chocolate2.setFlavour("Venilla");
chocolate2.brand="Kit Kat";
chocolate2.display();

}
}
