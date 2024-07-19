class Sky
{
public static double price(String medicineName)
{
System.out.println("starting price");
 System.out.println("medicineName:"+medicineName);
  if(medicineName=="Paracentamal")
  {
	  return 50;
  }
  if(medicineName=="ALmox")
  {
	  return 30;
  }
  if(medicineName=="Saridon")
  {
	  return 80;
  }
  if(medicineName=="Crocin")
  {
	  return 15;
  }
  if(medicineName=="Dexona")
  {
	  return 20;
  }
  System.out.println("no item matched");
  return 0;
  }
  
 public static String symptom(String medicineName)
{
System.out.println("starting symptom name");
System.out.println("Medicine:"+medicineName);
 if(medicineName=="paracentamal")
 {
	 return "Fever";
 }
 if(medicineName=="Crocin")
 {
	 return "Body Pain";
 }
 if(medicineName=="Almox")
 {
	 return "Common Cold";
 }
 if(medicineName=="Dexona")
 {
	 return "cold";
 }
 System.out.println("no found an movie");
 return "antibiotic";
 }
 
 
 public static  String availability(String doctorName)
{
System.out.println("starting availibility");
 System.out.println("doctorName:"+doctorName);
 if(doctorName=="Dr.Ajit Kumar")
 {
	 return "moring 8AM to 10AM";
 }
 if(doctorName=="Dr.Sanjay Choudhury")
 {
	 return "evening 6PM to 8PM";
 }
 if(doctorName=="Dr.Geetanjali")
 {
	 return "afternoon 11AM to 1PM";
 }
 if(doctorName=="Dr.Vishnu")
 {
	 return "Morning 8AM To 11AM";
 }
 System.out.println("no found an dotor");
 return "evening 4PM to 6PM";
 }
}








