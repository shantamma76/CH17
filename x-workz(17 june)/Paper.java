class Paper 
{
double thickness;
int size;
String quality;
String color="white";

public Paper(int size)
{
this.size=size;
} 

public void setQuality(String quality)
{
this.quality=quality;
}

public void display()
{
System.out.println("paper thickness:"+thickness);
System.out.println("paper size:"+size);
System.out.println("paper quality:"+quality);
System.out.println("paper color:"+color);

}
}
