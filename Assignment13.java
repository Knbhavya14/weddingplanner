import java.util.*;
class Assignment13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int a[]=new int[n];
		int s=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter target number");
		int t=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==t)
				s=1;
			else
				System.out.println(a[i]);
		}
		if(s==1)
			System.out.println("the given element found");
		else
			System.out.println("the given element not found");
	}
}