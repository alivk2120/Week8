import java.util.*;
class Prob10{
  public static void main(String args[]){
    List<Integer> list=new ArrayList();
    list.add(12);
    list.add(10);
    list.add(87);
    list.add(79);
    list.add(54);
    list.add(89);
    System.out.println("before shuffling");
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println("after shuffling");
    System.out.println(list);
  }
}