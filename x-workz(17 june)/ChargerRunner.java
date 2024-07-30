//25-07-2024

class ChargerRunner
{
public static void main(String[] args)
{
Charger charger=new Charger();
charger.name="techno";
charger.warranty=25;
System.out.println("serialno:"+charger.name);
System.out.println("warranty:"+charger.warranty);
System.out.println("price:"+charger.price);


Claw claw=new Claw();
claw.length=90;
claw.cost=100;
System.out.println("length:"+claw.length);
System.out.println("cost:"+claw.cost);
System.out.println("typeOfClaw:"+claw.typeOfClaw);


Crow crow=new Crow();
crow.height=5.3;
crow.weight=10;
System.out.println("height:"+crow.height);
System.out.println("weight:"+crow.weight);
System.out.println("birdColor:"+crow.birdColor); 


Clock clock=new Clock();
clock.timing=12.30;
clock.brand="lenova";
System.out.println("Timing:"+clock.timing);
System.out.println("Brand:"+clock.brand);
System.out.println("Price1:"+clock.price1);


Lolipop lolipop=new Lolipop();
lolipop.brand1="parlya";
lolipop.quantity=1;
System.out.println("brand1:"+lolipop.brand1);
System.out.println("quantity:"+lolipop.quantity);
System.out.println("cost1:"+lolipop.cost1);


Jean jean=new Jean();
jean.brand3="cotton";
jean.cost2=800;
System.out.println("Brand:"+jean.brand3);
System.out.println("cost2:"+jean.cost2);
System.out.println("price2:"+jean.price2);

Keyboard keyboard=new Keyboard();
keyboard.brand4="hp";
keyboard.price3=300;
System.out.println("brand4:"+keyboard.brand4);
System.out.println("price3:"+keyboard.price3);
System.out.println("totalKey:"+keyboard.totalKey);

Mountain mountain=new Mountain();
mountain.heightl=28456;
mountain.width=29564;
System.out.println("heightl:"+mountain.heightl);
System.out.println("width:"+mountain.width);
System.out.println("highestMoutain:"+mountain.highestMoutain);

Stadium stadium=new Stadium();
stadium.sarounding=560;
stadium.far=25.2;
System.out.println("sarounding:"+stadium.sarounding);
System.out.println("far:"+stadium.far);
System.out.println("name:"+stadium.name);


Spray spray=new Spray();
spray.price4=200;
spray.cost6=20.2;
System.out.println("price4:"+spray.price4);
System.out.println("brand5:"+spray.cost6);
System.out.println("name1:"+spray.name1);

}
}