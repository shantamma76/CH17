class PaperRunner
{
public static void main(String[] arhs)
{
Paper paper=new Paper(450);
paper.setQuality("Good");
paper.thickness=5.17;
paper.display();

System.out.println("==============================");


Paper paper1=new Paper(350);
paper1.setQuality("poor");
paper1.thickness=3.17;
paper1.display();

System.out.println("==============================");

Paper paper2=new Paper(250);
paper2.setQuality("best");
paper2.thickness=2.17;
paper2.display();






}
}