class Paint
{
public static void sketch(String brand)
{
System.out.println("parameter with string ");
System.out.println("Brand:" +brand);
}

public static void sketch(String brand,String color)
{
System.out.println("parameter with two strings");
System.out.println("Brand:" +brand);
System.out.println("Color:" +color);
}


public static void sketch(String brand,int price)
{
System.out.println("parameter with one string and one int");
System.out.println("Brand:" +brand);
System.out.println("Price:"+price);
}

public static void sketch(String brand,String type,int price)
{
System.out.println("parameter with two strings,one int");
System.out.println("Brand:" +brand);
System.out.println("Type:" +type);
System.out.println("Price:"+price);
}

}