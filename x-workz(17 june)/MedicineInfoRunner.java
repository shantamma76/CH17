class MedicineInfoRunner 
{
    public static void main(String[] args)
	{
        if (args.length==4) 
		{
            String name=args[0];
            String manfDate=args[1];
            String price=args[2];
            String quantity=args[3];
			long convertedManfDate=Long.parseLong(manfDate);
            int convertedPrice=Integer.parseInt(price);
            int convertedQuantity=Integer.parseInt(quantity);

            MedicineInfo.medicine(name,convertedManfDate,convertedPrice,convertedQuantity);
        }
		else
		{
				
            System.out.println("4 args required");
        }
    }
}