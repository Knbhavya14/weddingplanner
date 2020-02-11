import java.util.*;
public class Array4{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
       
        for(i=0;i<n;i++)
        {
          if(i%2!=0)
          {
              sum = sum+(arr[i]*i);
          }
         
        }
        System.out.println(sum);
    }
}