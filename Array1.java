import java.util.*;
public class Array1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,j,sum=0,count=0;
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
       
        for(i=2;i<n;i++)
        {   
            count = 0;
            for(j=1;j<=i;j++)
            {
              if(i%j==0)
              {
                  count++;
              }
            }
            if(count==2)
            {
              sum = sum + arr[i];  
            }
        }
        System.out.println(sum);
}
}