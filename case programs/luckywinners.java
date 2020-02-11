import java.util.Scanner;
class luckywinners
{
public static void main(String args[])
{
int date=0,billnum,rem;
Scanner obj= new Scanner(System.in);
System.out.println("Enter the billnum:");

System.out.println("Enter the date:");
billnum=obj.nextInt();
if(date>0 || date<=31)
{
  date=obj.nextInt();
}
  rem=billnum%100;
 if(rem==date || (billnum%date)==0)
{
   System.out.println("you are the lucky winner");
}
else
   System.out.println("You are not the lucky winner");
  
 }
}
 

