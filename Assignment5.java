import java.util.*;
public class Assignment5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int tot=m1+m2+m3;
		int avg=tot/3;
		System.out.println("Total = "+tot);
		System.out.println("Average = "+avg);
		if(avg>=60)
			System.out.println("First class");
		else if(avg>=50)
			System.out.println("Second class");
		else if(avg>=35)
			System.out.println("Pass class");
		else 
			System.out.println("Fail");
		
	}
}