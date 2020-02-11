import java.util.*;
public class Assignment12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		System.out.println("prime numbers are");
		for(int i=n;i<=m;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==2)
			{
					sum=sum+i;
					System.out.println(i);
			}
		}
		System.out.println("sum of prime numbers are "+sum);
	}
}