class Shanta
{
public static String file(int num)
{
System.out.println("number:"+num);
if(num%2==0)
{
return "even";
}
else{
return "odd";
}
}


public static String result(int studentMarks)
{
	System.out.println("student marks");
	if(studentMarks>=35)
	{
		return "pass";
	}
	else{
		return "fail";
	}
}
}