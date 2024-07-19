class ForestRunner
{
	public static void main(String[] forest)
{
System.out.println("Start main in forest");
if(forest.length==4)
{
	System.out.println("Getting 4 reff from main method arguments");
	
	String name=forest[0];
	String area=forest[1];
	String establishedYear=forest[2];
	String state=forest[3];
	
	System.out.println("name:"+name);
	System.out.println("area:"+area);
	System.out.println("established:"+establishedYear);
	System.out.println("state:"+state);
}
else
{
	System.out.println("Not enough reference need 4 reference");
}
System.out.println("End maain in forest");
}
}