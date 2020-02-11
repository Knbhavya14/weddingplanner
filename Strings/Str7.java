public class Str7 {
      public static boolean palindromeAndVowelCheck(String s){
            boolean b = true;
            int c = 0;
            String s1 = "aeiou";
            StringBuffer sb = new StringBuffer(s);
            String s2 = sb.reverse().toString();
            if(!s2.equals(s))
                  b=false;
            else{
                  loop:
                        for(int i = 0;i < s1.length();i++)
                              for(int j = 0;j < s.length();j++)
                                    if(s1.charAt(i) == s.charAt(j)){
                                          c++;
                                    continue loop;
                                    }
                        if(c<2)
                              b = false;
                        }
            return b;
      }
      public static void main(String[] args) {
            String s = "deed";
            System.out.println(palindromeAndVowelCheck(s));
      }
}