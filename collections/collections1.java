import java.util.*;
class ListManager{
public static ArrayList<String>  removeElements(ArrayList<String> list1,ArrayList<String> list2){
list1.removeAll(list2);
return list1;
}
public static void main(String args[])
{
ArrayList<String> list1=new ArrayList<String>();
list1.add("Bhavya"); 
list1.add("Bharath");  
list1.add("Rani");  
list1.add("Narayanaswamy");
ArrayList<String> list2=new ArrayList<String>();
list2.add("Bhavya");
list2.add("Bharath");
list2.add("raju");
list2.add("mothi");
System.out.println(removeElements(list1,list2));
}
}