//Write a Java program to iterate through all elements in a array list
import java.util.*;
class Prob2{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(1234);
    list.add("ali");
    list.add(97.56f);
    list.add(3456);
    for(Object obj:list){
      System.out.println(obj);
    }
  }
}