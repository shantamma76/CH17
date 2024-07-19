//task-3.declare a class,write two static methon and  main method also in same class.Invoke non-main methods from main method.

class Bench
{
public static void sit()
{
System.out.println("student sit on bench");
}
public static void write()
{
System.out.println("student write on bench");
}
public static void main(String[] args)
{
System.out.println("running");
Bench.sit();
Bench.write();
}
}
