//Write a Java program to reverse elements in a array list.
import java.util.*;
class Prob11{
  public static void main(String args[]){
    List<Integer> list=new ArrayList();
    list.add(12);
    list.add(10);
    list.add(87);
    list.add(79);
    list.add(54);
    list.add(89);
    System.out.println("original list");
    System.out.println(list);
    Collections.reverse(list);
    System.out.println("reversed list");
    System.out.println(list);
  }
}