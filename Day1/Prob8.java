//Write a Java program to sort a given array list
import java.util.*;
class Prob8{
  public static void main(String args[]){
    List<Integer> list=new ArrayList();
    list.add(12);
    list.add(10);
    list.add(87);
    list.add(79);
    list.add(54);
    list.add(89);
    System.out.println("before sorting");
    System.out.println(list);
    Collections.sort(list);
    System.out.println("after sorting");
    System.out.println(list);
  }
}