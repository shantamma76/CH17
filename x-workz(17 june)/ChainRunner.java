class ChainRunner
{
public static void main(String[] anything)
{
System.out.println("running main in ChainRunner");

int value=Chain.carat();
System.out.println("carat return type:"+value);

double price=Chain.costPerGram();
System.out.println("costPerGram return type:"+price);

String ref=Chain.type();
System.out.println(" return type:"+ref);

String reff=Chain.quality();
System.out.println("quality return type:"+reff);

double cost=Chain.quantity();
System.out.println("quantity return type:"+cost);

String reffs=Chain.wastage();
System.out.println("wastage return type:"+reffs);

double values=Chain.serviceCharge();
System.out.println("serviceCharge return type:"+values);

double check=Chain.GST();
System.out.println("GST returns type:"+check);
}
}