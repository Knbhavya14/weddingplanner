import java.util.*;
class Choco
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	int m,n;
	m=sc.nextInt();
	n=sc.nextInt();
        for(int i=1;i<n;i++)
{
	if(m>=i)
  		m=m-i;
	else
{
      n=i-1;
break;
}
}
	System.out.println("remaining = "+m);
	System.out.println("last on held= "+n);
}
}



