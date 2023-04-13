//Write a Java program to copy one array list into another
import java.util.*;
class Prob9{
  public static void main(String args[]){
    List<Integer> list=new ArrayList();
    list.add(12);
    list.add(10);
    list.add(87);
    list.add(79);
    list.add(54);
    list.add(89);
    System.out.println("list 1");
    System.out.println(list);
    List list1=new ArrayList();
    list1.addAll(list);
    System.out.println("list 2");
    System.out.println(list);
  }
}