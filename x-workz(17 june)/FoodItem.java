class Sky
{
public static double price(String medicineName)
{
System.out.println("starting price");
 System.out.println("medicineName"+medicineName);
  if(medicineName=="Metformin")
  {
	  return 50;
  }
  if(medicineName=="Nexium")
  {
	  return 70;
  }
  if(medicineName=="protamine sulface")
  {
	  return 100;
  }
  if(medicineName=="Digoxin")
  {
	  return 15;
  }
  System.out.println("no item matched");
  return 0;
  }
  public static String symptom(String medicineName)
{
System.out.println("starting symptom name");
 System.out.println("symptom"+medicineName);
 if(medicineName=="Prastamol")
 {
	 return "Fever";
 }
 if(medicineName=="Silicazib")
 {
	 return "leg and back pain";
 }
 if(medicineName=="Multi-vitamin")
 {
	 return "Physical Strength ";
 }
 System.out.println("no found an movie");
 return "antibiotic";
 }
 public static String doctorName(String availability)
{
System.out.println("starting doctorname");
 System.out.println("doctorName"+availability);
 if(availability=="Dr.Ajit Kumar")
 {
	 return "moring 8AM to 10AM";
 }
 if(availability=="Dr.Sanjay Choudhury")
 {
	 return "evening 6PM to 8PM";
 }
 if(availability=="Dr.Geetanjali")
 {
	 return "afternoon 11AM to 1PM";
 }
 System.out.println("no found an dotor");
 return "evening 4PM to 6PM";
 }
}








