class SkyRunner
{
public static void main(String[] args)
{
String medicineName1="Paracentamal";
double price1=Sky.price(medicineName1);
System.out.println("price:"+price1);

String medicineName2="ALmox";
double price2=Sky.price(medicineName2);
System.out.println("price:"+price2);

String medicineName3="Saridon";
double price3=Sky.price(medicineName3);
System.out.println("price:"+price3);

String medicineName4="Crocin";
double price4=Sky.price(medicineName4);
System.out.println("price:"+price4);

String medicineName5="Dexona";
double price5=Sky.price(medicineName5);
System.out.println("price:"+price5);



String medicineName6="paracentamal";
String symptom1=Sky.symptom(medicineName6);
System.out.println("symptom:"+symptom1);

String medicineName7="Crocin";
String symptom2=Sky.symptom(medicineName7);
System.out.println("symptom:"+symptom2);

String medicineName8="Almox";
String symptom3=Sky.symptom(medicineName8);
System.out.println("symptom:"+symptom3);

String medicineName9="Dexona";
String symptom4=Sky.symptom(medicineName9);
System.out.println("symptom:"+symptom4);



String doctorName1=Sky.availability("Dr.Ajit Kumar");
System.out.println("availibility:"+doctorName1);

String doctorName2=Sky.availability("Dr.Sanjay Choudhury");
System.out.println("availibility:"+doctorName2);

String doctorName3=Sky.availability("Dr.Geetanjali");
System.out.println("availibility:"+doctorName3);

String doctorName4=Sky.availability("Dr.Vishnu");
System.out.println("availibility:"+doctorName4);
}
}