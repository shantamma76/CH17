//(24/07/2024)

class RupeeRunner
{
public static void main(String[] args)
{
System.out.println("start main in RupeeRunner");

Rupee rupee=new Rupee();

String name=rupee.name;
double price=rupee.price;
int quantity=rupee.quantity;
System.out.println("Rupee name:"+name);
System.out.println("Rupee price:"+price);
System.out.println("Rupee quantity:"+quantity);


AirCondition condition=new AirCondition();

String brand=condition.brand;
int cost=condition.cost;
long amount=condition.amount;
System.out.println("Aircondition Name:"+name);
System.out.println("Aircomdition cost:"+cost);
System.out.println("Aircondition amount:"+amount);


Autorikshaw autorikshaw=new Autorikshaw();
int num=autorikshaw.num;
String color=autorikshaw.color;
char shirtSize=autorikshaw.shirtSize;
System.out.println("num:"+num);
System.out.println("color:"+color);
System.out.println("shirtSize:"+shirtSize);

Rapido rapido=new Rapido();
int totalChairs=rapido.totalChairs;
String xyz=rapido.xyz;
long mobileNo=rapido.mobileNo;
System.out.println("totalChairs:"+totalChairs);
System.out.println("xyz:"+xyz);
System.out.println("mobileNo:"+mobileNo);

CabCompany cabCompany=new CabCompany();
byte students=cabCompany.students;
boolean check=cabCompany.check;
short salary=cabCompany.salary;
System.out.println("students:"+students);
System.out.println("check:"+check);
System.out.println("salary:"+salary);

BMTC bmtc=new BMTC();
float percentage=bmtc.percentage;
double quanty=bmtc.quanty;
String location=bmtc.location;

FoodDeliveryCompany food=new FoodDeliveryCompany();
double sgpa=food.sgpa;
float timing=food.timing;
boolean trust=food.trust;
}
}