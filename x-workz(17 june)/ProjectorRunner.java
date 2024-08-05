class ProjectorRunner
{
public static void main(String[] args)
{
Projector projector=new Projector("LED");
projector.setColor("white");
projector.company="Epson";
projector.display();

System.out.println("==============================");

Projector projector1=new Projector("CRT");
projector1.setColor("Black");
projector1.company="BenQ";
projector1.display();

System.out.println("==============================");

Projector projector2=new Projector("LCD");
projector2.setColor("white");
projector2.company="Economic";
projector2.display();

}
}