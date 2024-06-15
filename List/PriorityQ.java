import java.util.*;
public class PriorityQ {
    //by default min heap hota hai
    public static void main(String[] args) {
        // Queue<Integer>pq=new PriorityQueue<>();
        // pq.add(50);
        // pq.add(40);
        // pq.add(30);
        // pq.add(20);
        // pq.add(10);
        // pq.offer(10);
        // pq.offer(500);
        // System.out.println(pq.size());
        // System.out.println(pq.peek());
        // while(!pq.isEmpty()){
        //     System.out.println(pq.poll());
        // }
        Queue<Integer>maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(40);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.offer(10);
        maxHeap.offer(500);
        //System.out.println(pq.size());
        System.out.println(maxHeap.peek());
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }

    }
    
    
    
    
    
    
    
}
