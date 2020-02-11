import java.util.*;
public class Array3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,index=0,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            index = i+1;
            if(index%2!=0)
            {
                sum = sum + (arr[i]*arr[i]*arr[i]);
            }
            else
            {
                sum = sum +(arr[i]*arr[i]);
            }
        }
      System.out.println(sum);
        
    }
}