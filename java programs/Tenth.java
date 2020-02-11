import java.util.Scanner;
public class Tenth {
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no of months");
        int month_no=input.nextInt();
        int i,first_no=0,second_no=1,third_no=0;
        
        for(i=1;i<=(month_no-2);i++)
        {
            third_no=first_no+second_no;
            first_no=second_no;
            second_no=third_no;
        }
        System.out.println(third_no);
        
    }
    
}