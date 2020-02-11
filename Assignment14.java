import java.util.*;
public class Assignment14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println(res);
	}
	static int fact(int n)
	{
		int f;
		if(n==1)
			return 1;
		
		f=n*fact(n-1);
		return f;
		
	}
}

