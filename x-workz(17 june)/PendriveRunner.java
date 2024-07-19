class PenDriveRunner
{
public static void main(String[] person)
{
System.out.println("Start main in Person");
 if(person.length==4)
{
System.out.println("Getting 4 reff from main method arguments");
String name=person[0];
String email=person[1];
String age=person[2];
String password=person[3];
System.out.println("Name:"+name);
System.out.println("Email:"+email);
System.out.println("Age:"+age);
System.out.println("password:"+password);
}
else
{
System.out.println("Not enough reference need 4 reference");
}
System.out.println("end main in person");
}
}


