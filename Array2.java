import java.util.*;
public class Array2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[2][n];
        int i,j,k,count=0;
        for(i=0;i<2;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int a=0,b=1;
	     for(i=0;i<n;i++)
			{
			   for(j=0;j<n;j++)
			   {
			      if(arr[a][i]==arr[b][j])
			      {
			          System.out.print(" "+arr[a][i]);     
			          count++;
			      }
			      else if(arr[b][i]==arr[a][j])
			      {
			          System.out.print(" "+arr[b][i]);
			          count++;
			      }
	    	   }
			}
			System.out.println("  Total "+count);
	    	
		}	

}