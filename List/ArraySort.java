import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
         //List<Integer>arr=new ArrayList<>(List.of(1,2,3,4,5,6));
       // List<Integer>arrl=new LinkedList<>(List.of(1,2,3,4,5,6));
       // System.out.println(arr);
        // int i=0,j=arr.size()-1;
        // while(i<j){
        //     int temp=arr.get(i);
        //     arr.set(i,arr.get(j));
        //     arr.set(j,temp);
        //     i++;
        //     j--;
        // }
        //Collections.reverse(arr);//reverse arraylist
       // Collections.sort(arr);//sort arraylist in assending order
        
       // System.out.println(arr);
       //Collections.sort(arr,Collections.reverseOrder());//sort arraylist in descending order
       // System.out.println(arr);
       //now learn normal or primitive array concet
    //    int arrp[]=new int[5];
    //    arrp[0]=1;
    //    arrp[1]=2;
    //    arrp[2]=3;
    //    arrp[3]=4;
    //    arrp[4]=5;
    //    for(int x:arrp){
    //     System.out.print(x+" ");
    //    }
    int arr[]={1,23,4,5,6,8};
    Arrays.sort(arr);
    for(int x:arr)
    {
        System.out.print(x+" ");
    }

    int arrd[][]={{1,2,3,5,6},{4,5,6},{7,8,9}};
    System.out.println(arrd[0].length);  
    
    
    }
    //vector bhi same hai
    //use vector in thread safe implementation only
    
}
