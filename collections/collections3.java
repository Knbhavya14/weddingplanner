import java.util.*;
class UniqueCollection {
public static TreeSet<String> getCollection(String elements[])
{
TreeSet<String> two12 = new TreeSet<String>(Arrays.asList(elements));
return two12;
}
public static void main(String args[]){
String[] two={"mounika","bhavya","kavya","soni","thulasi","bhanu","sai"};
System.out.println(getCollection(two));
}
}