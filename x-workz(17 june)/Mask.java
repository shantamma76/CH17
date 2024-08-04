// 31/07/2024 Multiple Constructor Declarations
class Mask
{
double cost;
char size;
String material;
Mask()
{
System.out.println("Create No parameter constructor");
}

Mask(double cost)
{
System.out.println("Initializing only cost");
this.cost=cost;
}

Mask(char size)
{
System.out.println("Initializing Only Size");
this.size=size;
}

Mask(String material)
{
System.out.println("Initializing Only Material");
this.material=material;
}

Mask(double cost,char size,String material)
{
System.out.println("initializing Cost,Size,and Material");
this.cost=cost;
this.size=size;
this.material=material;
}

Mask(double cost,char size)
{
System.out.println("initializing Cost and Size");
this.cost=cost;
this.size=size;
}
}