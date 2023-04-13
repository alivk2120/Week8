//Write a Java program to insert an element into the array list at the first position
import java.util.*;
class Prob3{
  public static void main(String args[]){
    List<Integer> list=new ArrayList();
    list.add(1234);
    list.add(2343);
    list.add(5678);
    list.add(786);
    list.set(1,420);
    System.out.println(list);
  }
}