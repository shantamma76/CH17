class Projector
{
String company;
String type;
String color;
double weight=100;

public Projector(String type)
{
this.type=type;
}

public void setColor(String color)
{
this.color=color;
}

public void display()
{
System.out.println("projector company:"+company);
	System.out.println("projector type:"+type);
	System.out.println("projector color:"+color);
	System.out.println("projector weight:"+weight);	
}
}
