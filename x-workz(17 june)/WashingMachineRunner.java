//task-1:Declare a class,and declare 10 static methods and invoke frome main method in another class.

class WashingMachineRunner
{
public static void main(String[] args)
{
	System.out.println("running main in WashingMachineRunner");
	WashingMachine.makeNoise();
	WashingMachine.showTime();
	WashingMachine.rinse();
	WashingMachine.soak();
	WashingMachine.dry();
	WashingMachine.start();
	WashingMachine.stop();
	WashingMachine.work();
	
	  
	}
}
