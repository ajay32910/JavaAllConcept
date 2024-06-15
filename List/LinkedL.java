import java.util.*;
public class LinkedL {
    public static void main(String args[]){
        LinkedList<Integer> link=new LinkedList<Integer>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.remove(0);
        System.out.println(link.get(0));
    }
}
