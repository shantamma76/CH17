// 31/07/2024 Multiple Constructor Declarations

class KeroseneRunner
{
public static void main(String[] args)
{
Kerosene kerosene=new Kerosene();
System.out.println("Price:"+kerosene.price);
System.out.println("Quantity:"+kerosene.quantity);
System.out.println("Quality:"+kerosene.quality);

Kerosene kerosene1=new Kerosene(80.2,20,true);
System.out.println("init updated price:"+kerosene1.price);
System.out.println("init updated quantity:"+kerosene1.quantity);
System.out.println("init updated quality:"+kerosene1.quality);

Kerosene kerosene2=new Kerosene(false);
System.out.println("init updated quality:"+kerosene2.quality);

Kerosene kerosene3=new Kerosene(83.6);
System.out.println("init updated price:"+kerosene3.price);
}
}
