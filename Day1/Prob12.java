//Write a Java program of swap two elements in an array list.
import java.util.*;
class Prob12{
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
    Collections.swap(list,87,10);
    System.out.println("reversed list");
    System.out.println(list);
  }
}