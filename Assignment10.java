import java.util.*;
public class Assignment10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
			int sum=1;
			for(int i=n;i>0;i--)
				sum=sum*i;
			System.out.println(sum);
		}
		else
			System.out.println("given number is negative");
	}
}