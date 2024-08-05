class SpeakerRunner
{
public static void main(String[] values)
{
Speaker speaker=new Speaker("small");
speaker.setCost(500);
speaker.brand="Hp";
speaker.display();

System.out.println("==============================");

Speaker speaker1=new Speaker("medium");
speaker1.setCost(300);
speaker1.brand="lenova";
speaker1.display();


System.out.println("==============================");

Speaker speaker2=new Speaker("Big");
speaker2.setCost(1000);
speaker2.brand="vectus";
speaker2.display();

}
}

