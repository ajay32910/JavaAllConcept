import java.util.*;
public class ListL {
    public static void main(String[] args) {
        //List arr=new ArrayList();
        //vector<int>arr(5,-1); 
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        //vector<int>::iterator itr
        //arr.insert(arr.begin(),1);
        arr.add(0,0);
        //System.out.println("hello");
        

        System.out.println(arr.size());
        System.out.println(arr.get(0));
        //clear(), erase(position), find()
        arr.remove(0);//can remover object also
        arr.set(0,50);
        arr.reversed();
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    
    }
}
