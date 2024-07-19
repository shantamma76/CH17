class PalaceRunner
{
public static void main(String[] palace)
{
System.out.println("start main in palace");
if(palace.length==4)
{
System.out.println("Getting 4 reff from main method arguments");
String Name=palace[0];
String Location=palace[1];
String builtBy=palace[2];
String builtYear=palace[3];
System.out.println("Name:"+Name);
System.out.println("Location:"+Location);
System.out.println("builtBy:"+builtBy);
System.out.println("builtYear:"+builtYear);
}
else
{
System.out.println("Not enough reff needs 4 refference");
}
System.out.println("End main in palace");
}
}
