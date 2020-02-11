import java.util.*;
class bestoffer{
public static void main(String args[])
{
int discount=20,amount,n1,n2,n3,s,price,temp,result,small;
Scanner obj=new Scanner(System.in);
System.out.println("Enter price:");
n1=obj.nextInt();
n2=obj.nextInt();
n3=obj.nextInt();
price=n1+n2+n3;
System.out.println("Total amount=" +price);
s=100-discount;
amount=(s*price)/100;
System.out.println("offer 1 price=" +amount);
temp=n1<n2?n1:n2;
small=n3<temp?n3:temp;
result=price-small;
System.out.println("offer 2 price=" +result);
if(amount<result)
{
System.out.println("use offer 1");
}
else{
System.out.println("use offer 2");
}
}
}

