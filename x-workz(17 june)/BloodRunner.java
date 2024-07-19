class BloodRunner
{
public static void main(String[] anything)
{
System.out.println("running main in BloodRunner");

char value=Blood.group();
System.out.println("Group return type:"+value);

String ref=Blood.personName();
System.out.println("PersonName return type:"+ref);

int price=Blood.cost();
System.out.println("Cost return type:"+price);

String reff=Blood.hospitalTested();
System.out.println("HospitalTested return type:"+reff);

boolean check=Blood.sickness();
System.out.println("Sickness return type:"+check);

boolean whether=Blood.donate();
System.out.println("Denate return type:"+whether);
}
}