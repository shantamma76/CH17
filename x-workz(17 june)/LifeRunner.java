class LifeRunner
{
public static void main(String[] code)
{
System.out.println("start main method");

String name=Life.code(91);
System.out.println("name:"+name);
String countrys1=Life.code(92);
System.out.println("name:"+countrys1);
String countrys2=Life.code(93);
System.out.println("name:"+countrys2);
String countrys3=Life.code(94);
System.out.println("name:"+countrys3);
String countrys4=Life.code(95);
System.out.println("name:"+countrys4);
String country5=Life.code(96);
System.out.println("name:"+country5);
String country6=Life.code(97);
System.out.println("name:"+country6);

String item="Dosa";
double price1=Life.price(item);
System.out.println("price:"+price1);
String item2="bhel pure";
double price2=Life.price(item2);
System.out.println("price:"+price2);
String item3="paneer butter masala";
double price3=Life.price(item3);
System.out.println("price:"+price3);
String item4="veg biriyani";
double price4=Life.price(item4);
System.out.println("price:"+price4);
String item5="rasamalai";
double price5=Life.price(item5);
System.out.println("price:"+price5);
String item6="poori";
double price6=Life.price(item6);
System.out.println("price:"+price6);

String produer1="Moggina Manasu";
String movie1=Life.movie(produer1);
System.out.println("produer:"+movie1);
String produer2="Mr and Mrs Ramachari";
String movie2=Life.movie(produer2);
System.out.println("produer:"+movie2);
String produer3="Googly";
String movie3=Life.movie(produer3);
System.out.println("produer:"+movie3);
String produer4="Santu Straight Forward";
String movie4=Life.movie(produer4);
System.out.println("produer:"+movie4);
String produer5="Miss India";
String movie5=Life.movie(produer5);
System.out.println("produer:"+movie5);
String produer6="thappad";
String movie6=Life.movie(produer6);
System.out.println("produer:"+movie6);
}
}