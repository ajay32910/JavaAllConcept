import java.util.*;
public class SetL {
    public static void main(String args[]){
        //set implement collanable and serializable interface
    //     Set<Integer> set=new HashSet<>();
    //     set.add(0);
    //     set.add(1);
    //     set.add(2);
    //     set.add(3);
    //     set.add(4);
    //     set.add(4);
    //    System.out.println(set);
    //    set.remove(1);
    //    System.out.println(set);
    //    System.out.println(set.contains(4));
       //linkedHashSet slower hota hai, order of insertion maintend raheta 
       TreeSet<Integer> tset=new TreeSet<>();
       tset.add(10);
       tset.add(5);
       tset.add(50);
       tset.add(40);
       tset.add(1);
       tset.add(0);
       System.out.println(tset);

    }
}
