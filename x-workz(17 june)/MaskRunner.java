// 31/07/2024 Multiple Constructor Declarations

class MaskRunner
{
public static void main(String[] args)
{
Mask mask=new Mask();
System.out.println("cost:"+mask.cost);
System.out.println("Size:"+mask.size);
System.out.println("Material:"+mask.material);

Mask mask1=new Mask(50.2);
System.out.println("init cost:"+mask1.cost);

Mask mask2=new Mask('M');
System.out.println("init size:"+mask2.size);

Mask mask3=new Mask("BeautyItems");
System.out.println("init Material:"+mask3.material);

Mask mask4=new Mask(60,'S',"Dress");
System.out.println("init updated cost:"+mask4.cost);
System.out.println("init updated size:"+mask4.size);
System.out.println("init updated material:"+mask4.material);

Mask mask5=new Mask(100,'L');
System.out.println("init cost:"+mask5.cost);
System.out.println("init size:"+mask5.size);

}
}