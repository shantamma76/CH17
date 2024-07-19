class Country
{ 
public static void states(String[] states)
{
System.out.println("Start States in Country");
 for(int total=0; total<states.length; total++)
 {
 String ref=states[total];
 System.out.println("State:"+ref);
 }
 System.out.println("End States in Country");
}

public static void pincode(int[] pincode) 
{
	System.out.println("Start Pincode in Country");
	for(int code=0; code<pincode.length; code++)
	{
		int ref1=pincode[code];
		System.out.println("pincode:"+ref1);
	}
	System.out.println("End pincode in country");
}

public static void primeMinister(String[] primeMinister)
{
	System.out.println("Start PrimeMinister in Country");
	for(int mini=0; mini<primeMinister.length; mini++)
	{
		String ref2=primeMinister[mini];
		System.out.println("PrimeMinister:"+ref2);
		
	}
	System.out.println("End primeMinister in Country");
} 


public static void CabinetMinisters(String[] CabinetMinisters)
{
	System.out.println("Start Cabinet ministers in Country");
	for(int cabinet=0; cabinet<CabinetMinisters.length; cabinet++)
	{
		String ref3 = CabinetMinisters[cabinet];
		System.out.println("CabinetMinisters:"+ref3);
	}
	System.out.println("End CabinetMinisters in Country");
}

public static void politicalParties(String[] politicalParties)
{
	System.out.println("Start political parties in country");
	for(int party=0; party<politicalParties.length; party++)
	{
		String ref4 = politicalParties[party];
		System.out.println("PoliticalParties:"+ref4);
	}
	System.out.println("End political parties in country");
}


// 16-07-2024 Above methods print in backward direction.

public static void statesBackward(String[] states)
{
System.out.println("==============Backward=================");
System.out.println("Start States in Country");
 for(int total=states.length-1; total>=0; total--)
 {
 String ref=states[total];
 System.out.println("State:"+ref);
 }
 System.out.println("End States in Country");
}

public static void pincodeBackward(int[] pincode) 
{
	System.out.println("Start Pincode in Country");
	for(int code=pincode.length-1; code>=0; code--)
	{
		int ref1=pincode[code];
		System.out.println("pincode:"+ref1);
	}
	System.out.println("End pincode in country");
}

public static void primeMinisterBackward(String[] primeMinister)
{
	System.out.println("Start PrimeMinister in Country");
	for(int mini=primeMinister.length-1; mini>=0; mini--)
	{
		String ref2=primeMinister[mini];
		System.out.println("PrimeMinister:"+ref2);
		
	}
	System.out.println("End primeMinister in Country");
} 

public static void CabinetMinistersBackward(String[] CabinetMinisters)
{
	System.out.println("Start Cabinet ministers in Country");
	for(int cabinet=CabinetMinisters.length-1; cabinet>=0; cabinet--)
	{
		String ref3 = CabinetMinisters[cabinet];
		System.out.println("CabinetMinisters:"+ref3);
	}
	System.out.println("End CabinetMinisters in Country");
}

public static void politicalPartiesBackward(String[] politicalParties)
{
	System.out.println("Start political parties in country");
	for(int party=politicalParties.length-1; party>=0; party--)
	{
		String ref4 = politicalParties[party];
		System.out.println("PoliticalParties:"+ref4);
	}
	System.out.println("End political parties in country");
}
}