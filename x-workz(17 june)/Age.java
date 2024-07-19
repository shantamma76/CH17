class Age
{
public static void allow(int age)
{
System.out.println("age:"+age);
if(age>50 && age<70)
{
System.out.println("Age is between 50 and 70 (exclusive)");
} 
else {
System.out.println("Age is not between 50 and 70");
}
}
}