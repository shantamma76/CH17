class Life
{
 public static String code(int country)
 {
 System.out.println("returning code in shop");
 System.out.println("country:"+country);
 if(country==91)
 {
 return "india";
 }
 if(country==92)
 {
  return "Italy";
 }
 if(country==93)
 {
 return "Australia";
 }
 if(country==94)
 {
 return "Canada";
 }
 if(country==95)
 {
 return "USA";
 }
 if(country==96)
 {
 return "Japan";
 }
 return "not found";
 }
 
 
 public static double price(String item)
 {
 System.out.println("starting price");
 System.out.println("item"+item);
  if(item=="Dosa")
  {
	  return 50;
  }
  if(item=="bhel pure")
  {
	  return 70;
  }
  if(item=="paneer butter masala")
  {
	  return 150;
  }
  if(item=="veg biriyani")
  {
	  return 195;
  }
  if(item=="rasamalai")
  {
	  return 75;
  }
  System.out.println("no item matched");
  return 0;
  }
  
  
public static String movie(String produer)
{
System.out.println("starting movies name");
 System.out.println("movie"+produer);
 if(produer=="hum Aapke hain koun")
 {
	 return "Sooraj r Barjatya";
 }
 if(produer=="veer-zaara")
 {
	 return "yash chopra";
 }
 if(produer=="gully boy")
 {
	 return "zoya Akhtar";
 }
 if(produer=="gera pheri")
 {
	 return "priyadarshan";
 }
 if(produer=="dhoom")
 {
	 return "sanjay gadhvi";
 }
 System.out.println("no found an movie");
 return "Anubhav Sinha";
 }
}





