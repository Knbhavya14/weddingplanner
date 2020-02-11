import java.util.*;
class MapManager{
public static Set<Integer> getKeys(HashMap<Integer,String>a)
{
Set<Integer> s=a.keySet();
return s;
}
public static void main(String args[]){
HashMap<Integer,String> s=new HashMap<Integer,String>();
s.put(1,"bhavya");
s.put(2,"mounika");
s.put(3,"kavya");
s.put(4,"soni");
System.out.println(getKeys(s));
}
}