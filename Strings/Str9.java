import java.util.*;
public class Str9 {
      public static int negativeString(String s1){
            int n1 = 0;
            if(s1.startsWith("-")){
                  int n=Integer.parseInt(s1);
                  if(n<0)
                        n1 = Math.abs(n);}
                  else
                        n1 = -1;
            return n1;
      }
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String s1 = s.next();
            System.out.println(negativeString(s1));
      }
}
