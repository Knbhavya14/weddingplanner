import java.util.*;
public class Array5{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[2][n];
        int i,j,p=1;
        for(i=0;i<2;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
                System.out.println("");
            }
        }
		for(i=0;i<n;i++)
		{
			System.out.println(arr[p%2][i]);
                        System.out.println("");
			p++;
		}	
			
}
}