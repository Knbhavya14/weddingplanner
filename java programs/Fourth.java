import java.util.Scanner;
public class Fourth{
    public static void main(String args[]){
        
        int remaining_sticks=0,actual_sticks_for_one_row=0,largest_square_area=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter the no of stick ");
        int stick_no=input.nextInt();
        
        remaining_sticks=stick_no%4;
        actual_sticks_for_one_row=(stick_no-remaining_sticks)/4;
        
        largest_square_area=((actual_sticks_for_one_row*2)*(actual_sticks_for_one_row*2));
        
        System.out.println("the largest square in the given sticks is :"+largest_square_area);
        
    
    }
    
}