//Write a Java program to remove the third element from a array list
import java.util.*;
class Prob6{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(12);
    list.add(24);
    list.add(78);
    list.add(76);
    list.add(56);
    list.remove(3);
    System.out.println(list);
  }
}