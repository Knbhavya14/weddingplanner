import java.util.*;
public class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();	
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=((a>b)&&(a>c))?a:((b>c)?b:c);
		System.out.println("Largest value is  "+res);
	}
}