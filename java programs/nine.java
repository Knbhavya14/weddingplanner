import java.util.*;
class nine{
public static void main(String args[])
{
int num1,num2;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the 1st number:");
num1=obj.nextInt();
System.out.println("Enter the 2nd number:");
num2=obj.nextInt();
if(num1<=num2){
   for(int i=num1;i<=num2;i++)
   {
      System.out.println(+i);
   }
  }
}
}