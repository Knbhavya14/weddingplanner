import java.util.*;
class ListManager1{
public static ArrayList getArrayList(String elements[])
{
ArrayList<String> two12=new ArrayList<String>(Arrays.asList(elements));
Collections.sort(two12);
return two12;
}
public static void main(String args[]){
String[] two={"mounika","bhavya","kavya","soni","thulasi","bhanu","sai"};
System.out.println(getArrayList(two));
}
}