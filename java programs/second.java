import java.util.Scanner;
public class second {
    public static void main(String args[])
    {
        int i=0,value=0,j=0,sum=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value of N");
        int number=input.nextInt();
        for(i=1;i<=number;i++){
            
            System.out.println("Enter the number : ");
            value=input.nextInt();
            if(value>0){
                    j++;
                    sum=sum+value;
            }
        }
        
        System.out.println("the no of positive no entered : "+j);
        System.out.println("the sum of all the positive no entered : "+sum);
        
    }
    
}