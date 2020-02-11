import java.util.*;
public class Assignment4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int lar=((a>b)&&(a>c))?a:((b>c)?b:c);
		int mid=((a!=lar&&(a>c||a>b))?a:(b!=lar&&(b>c||b>a))?b:c);
		System.out.println("largest number= "+lar+"     middle number= "+mid);
		
	}
}