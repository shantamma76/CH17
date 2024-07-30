class JeanRunner
{
public static void main(String[] args)
{
Jean jean=new Jean();
double price=jean.price;
String brand=jean.brand;
System.out.println("price:"+price);
System.out.println("size:"+jean.size);
System.out.println("brand:"+brand);
jean.size=32;
System.out.println("updated size:"+jean.size);

Jean jean1=new Jean();
jean1.price=400;
jean1.brand="ton";
System.out.println("updated price:"+jean1.price);
System.out.println("updated brand:"+jean1.brand);
}
}