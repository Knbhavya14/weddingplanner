import java.util.*;
public class eight {
    public static void main(String args[]){
        int a=0,i=0,b=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your target");
        int target=input.nextInt();
        
        while(a<target)
        {
            System.out.println(" ");
           
            b=input.nextInt();
            a=a+b;
            i=i+1;
        }
        System.out.println("the number of turns is : "+ i);
    
    }
    
}