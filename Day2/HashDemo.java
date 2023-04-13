import java.util.HashMap;
import java.util.Map;
class HashDemo{
  public static void main(String args[]){
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(101,"ali");
    map.put(102,"sa");
    map.put(103,"ka");
    map.putIfAbsent(104, "s");
    map.putIfAbsent(104, "s");
    System.out.println(map);
  for(Map.Entry m:map.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
  }
}