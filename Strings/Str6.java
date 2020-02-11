public class Str6{
      public static boolean stringPattern(String s1,String s2){
            String st1 = s1.length() < s2.length()?s1:s2;
            String st2 = s1.length() > s2.length()?s1:s2;
            boolean b = true;
            String s = st2.substring(st1.length());
            if(s.contains("-"))
                  b = false;
            else {
                  loop:
                        for(int i = 0;i < st1.length();i++)
                              if((st1.charAt(i) == '-') || (st2.charAt(i) == '-'))
                                    if(st1.charAt(i) != st2.charAt(i)) {
                                          b = false;
                                          break loop;
                                    }
            }
            return b;
      }
      public static void main(String[] args) {
            String s1 = "he--ll--";
            String s2 = "well--";
            boolean b = stringPattern(s1,s2);
            if(b == true)
                  System.out.println("same pattern");
            else
            System.out.println("different pattern");
      }
}