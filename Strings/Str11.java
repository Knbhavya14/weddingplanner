import java.util.*;
public class Str11 {
      public static void main(String[] args) {
            String ipAddress = "010.230.110.160";
            boolean b=validateIpAddress(ipAddress);
            if(b == true)
                  System.out.println("valid ipAddress");
            else
                  System.out.println("not a valid ipAddress");
      }
      public static boolean validateIpAddress(String ipAddress) {
            boolean b1 = false;
            StringTokenizer t = new StringTokenizer(ipAddress,".");
            int a = Integer.parseInt(t.nextToken());
            int b = Integer.parseInt(t.nextToken());
            int c = Integer.parseInt(t.nextToken());
            int d = Integer.parseInt(t.nextToken());
            if((a >= 0 && a <= 255)&&(b >= 0 && b <= 255)&&(c >= 0 && c <= 255)&&(d >= 0 && d <= 255))
                  b1=true;
            return b1;
      }
}