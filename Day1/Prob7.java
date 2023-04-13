//Write a Java program to search an element in a array list.
import java.util.*;
class Prob7{
  public static void main(String args[]){
    int count=0;
    List<String> list=new ArrayList();
    list.add("Hello");
    list.add("hi");
    list.add("apple");
    list.add("orange");
    for(String str:list){
      if(str.equals("apple")){
        count++;
      }
    }
    if(count>0){
      System.out.println("element found at position "+list.indexOf("apple"));
    }
    else{
      System.out.println("element not found");
    }
    
  }
}