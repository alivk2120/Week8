//Write a Java program to update specific array element by given element
import java.util.*;
class Prob5{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(123);
    list.add(234);
    list.add(456);
    list.add(2345);
    list.set(2,420);
    System.out.println(list);
  }
}