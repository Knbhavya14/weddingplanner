import java.util.*;
public class Str4{
      public static String concatStrings(String s1,String s2){
            StringBuffer sb = new StringBuffer();
            if(s1.length() == s2.length())
                  sb.append(s1).append(s2);
            else if(s1.length() > s2.length()){
                  s1 = s1.substring(s1.length()/2, s1.length());
                  sb.append(s1).append(s2);
            }
            else if(s1.length() < s2.length()){
                  s2 = s2.substring(s2.length()/2, s2.length());
                  sb.append(s1).append(s2);
            }
            return sb.toString();
      }
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String s1 = s.next();
            String s2 = s.next();
            System.out.println(concatStrings(s1,s2));
      }
}