//06-08-2024

class State
{
String name;
String langauge;
String capitalCity1="Banaglore";

CapitalCity capitalCity=new CapitalCity("Delhi");

State(String langauge)
{
	this.langauge=langauge;
}

public void kick()
{
	
System.out.println("name:"+name);
System.out.println("langauge:"+langauge);
System.out.println("capitalCity:"+capitalCity);
this.capitalCity.eat();
}
}


