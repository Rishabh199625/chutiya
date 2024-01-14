import java.util.*;
class ArrayListDemo
{
public static void main(String s[])
{
ArrayList<String>  al=new ArrayList<String>();
//ArrayList  al=new ArrayList();
System.out.println(al.size());
al.add("A");
al.add("B");
al.add("K");
al.add("D");
al.add("E");
al.add("F");
System.out.println(al.size());
al.remove(2);
System.out.println(al.size());
System.out.println(al);
}
}


