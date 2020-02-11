import java.util.Scanner;
public class seventhprgm {
    
    public static void main(String args[])
    {
        int i=1;
        float marks_get=0;
        //boolean a=false;
        while(i<=3 )
        {
        Scanner input =new Scanner(System.in);
        System.out.println(" ");
       float number = input.nextFloat();
       if(number>0)
      {
          if(number%2!=0 )
          {
              i=i+1;
          marks_get=marks_get+1;
          }
          
          else
          {
              marks_get=(float) (marks_get-0.5);
              i=i;
          }
      }
       else
       {
           marks_get=(float) (marks_get-1.0);
           i=4;
       }
          
        }
       
      System.out.println(""+ marks_get);
    }
}

