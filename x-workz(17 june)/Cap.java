//30-07-2024

class Cap
{
String color;
int cost;
double price;

Cap(String colorLocal,int costLocal,double priceLocal)
{
	color=colorLocal;
	cost=costLocal;
	price=priceLocal;
	
System.out.println("Creating Cap");
}
}

class Gold
{
	String type;
	String color;
	int rate;
Gold(String typeLocal,String colorLocal,int rateLocal)
{
	type=typeLocal;
	color=colorLocal;
	rate=rateLocal;
System.out.println("Creating Gold");
}
}

class Board
{
	String color;
	int width;
	double height;
Board(String colorLocal,int widthLocal,double heightLocal)
{   
    color=colorLocal;
    width=widthLocal;
	height=heightLocal;
System.out.println("Creating Board");
}
}

class Led
{
	int voltage;
	String type;
	double price;
Led(int voltageLocal,String typeLocal,double priceLocal)
{
	voltage=voltageLocal;
	type=typeLocal;
	price=priceLocal;
System.out.println("Creating Led");
}
}

class SimCard
{
	String brand;
	String type;
	int price;
SimCard(String brandLocal,String typeLocal,int priceLocal)
{
	brand=brandLocal;
	type=typeLocal;
	price=priceLocal;
System.out.println("Creating SimCard");
}
}