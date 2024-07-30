//Update the instance Variables and print for below classes.(24/07/2024)

class MatrimonyRunner
{
public static void main(String[] args)
{
System.out.println("Start main in Matrimony Runner");
Matrimony matrimony=new Matrimony();
String name=matrimony.name;
double price=matrimony.price;
int quantity=matrimony.quantity;
matrimony.name="Rdha";
matrimony.price=2500;
matrimony.quantity=150;
System.out.println("name:"+matrimony.name);
System.out.println("Price:"+matrimony.price);
System.out.println("quantity:"+matrimony.quantity);

Application application=new Application();
String platform=application.platform;
int cost=application.cost;
long amount=application.amount;
application.platform="Google";
application.cost=231;
application.amount=5000;
System.out.println("platform:"+application.platform);
System.out.println("cost:"+application.cost);
System.out.println("amount:"+application.amount);


Fruit fruit=new Fruit();
int num=fruit.num;
String fruitName=fruit.fruitName;
char shirtSize=fruit.shirtSize;
fruit.num=60;
fruit.fruitName="Mango";
fruit.shirtSize='M';
System.out.println("num:"+fruit.num);
System.out.println("fruitName:"+fruit.fruitName);
System.out.println("shirtSize:"+fruit.shirtSize);

Juice juice=new Juice();
String juiceName=juice.juiceName;
int pincode=juice.pincode;
double costs=juice.costs;
juice.juiceName="Apple";
juice.pincode=585103;
juice.costs=50;
System.out.println("juiceName:"+juice.juiceName);
System.out.println("pincode:"+juice.pincode);
System.out.println("cost:"+juice.costs);

Place place=new Place();
String area=place.area;
boolean check=place.check;
short distance=place.distance;
place.area="Rajaji Nagar";
place.check=true;
place.distance=405;
System.out.println("area:"+place.area);
System.out.println("check:"+place.check);
System.out.println("distance:"+place.distance);

AlcoholBrand alcohal=new AlcoholBrand();
String brands=alcohal.brands;
int money=alcohal.money;
long members=alcohal.members;
alcohal.brands="King Fisher";
alcohal.money=500;
alcohal.members=9000;
System.out.println("brands:"+alcohal.brands);
System.out.println("money:"+alcohal.money);
System.out.println("members:"+alcohal.members);

Candy candy=new Candy();
float percentage=candy.percentage;
double quanty=candy.quanty;
String where=candy.where;
candy.percentage=50.21F;
candy.quanty=20.5565;
candy.where="phone";
System.out.println("percentage:"+candy.percentage);
System.out.println("quanty:"+candy.quanty);
System.out.println("where:"+candy.where);

Medicine medicine=new Medicine();
String tablet=medicine.tablet;
int tabletCost=medicine.tabletCost;
double manufacture=medicine.manufacture;
medicine.tablet="Parcentamal";
medicine.tabletCost=10;
medicine.manufacture=12.24;
System.out.println("tablet:"+medicine.tablet);
System.out.println("tablete cost:"+medicine.tabletCost);
System.out.println("manufacture:"+medicine.manufacture);

Food food=new Food();
String foodName=food.foodName;
double foodPrice=food.foodPrice;
int howMany=food.howMany;
food.foodName="Masal Dosa";
food.foodPrice=55.5;
food.howMany=5;
}
}