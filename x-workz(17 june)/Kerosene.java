// 31/07/2024 Multiple Constructor Declarations

class Kerosene
{
double price;
int quantity;
boolean quality;

Kerosene()
{
System.out.println("Create No parameter constructor");
}

Kerosene(double price,int quantity,boolean quality)
{
System.out.println("Initialing price,quantity and quality");
this.price=price;
this.quantity=quantity;
this.quality=quality;
}

Kerosene(boolean quality)
{
System.out.println("Initialing only quality");
this.quality=quality;
}

Kerosene(double price)
{
System.out.println("Initialing only price");
this.price=price;
}
}