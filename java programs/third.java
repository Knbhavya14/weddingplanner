import java.util.Scanner;
public class third {
    public static void main(String args[])
    {  
        int number;
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 18 :");
        number=obj.nextInt();
        while(number<=18&&number>=1)
        {
        sum=sum+number%10;
        number=number/10;
        }
      System.out.println("Patrick and Jphnny must go in path " + sum +  "to find Alice");
    }

}