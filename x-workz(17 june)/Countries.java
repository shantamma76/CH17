//06-08-2024

class Countries
{
String name;
String continent;
String state1="Maharastra";

State state=new State("kannada");

Countries(String continent)
{
	this.continent=continent;
}

public void check()
{
System.out.println("country name:"+this.name);
System.out.println("country continent:"+this.continent);
System.out.println("country State:"+this.state1);
this.state.kick();



}
}
