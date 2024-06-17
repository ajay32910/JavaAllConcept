import java.util.*;
public class Mapl {
    public static void main(String args[]){
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"oneplus");
        map.put(2,"apple");
        map.put(3,"blackBerry");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        map.getOrDefault(0,"1");//insert default value if key is previously not mapped
        for(Map.Entry<Integer,String>e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
           // System.out.println(e.getValue());
        }
    
        //
        //map interface->implement hashMap->extend by LinkedHashmap 
        //map interface ->extend sortedMap(interface hota hai)->implement treeMap()

    
        Set<Integer> key=map.keySet();
        for(Integer k:key){
            System.out.println(k+""+map.get(k));
        }
    }
}
